package za.ac.cput.repositories.implimentation.DriverRepositoryImpl;

import za.ac.cput.Domain.Driver.DriverContact;
import za.ac.cput.repositories.DriverRepository.DriverContactRepository;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DriverContactRepositoryImpl implements DriverContactRepository {

    private static DriverContactRepository repository = null;
    private Set<DriverContact> driverContacts;

    public DriverContactRepositoryImpl(){this.driverContacts = new HashSet<>();}

    private static DriverContactRepository getRepository()
    {
        if (repository == null) repository = new DriverContactRepositoryImpl();
        return  repository;
    }

    @Override
    public Set<DriverContact> getAll() {
        return driverContacts;
    }

    @Override
    public DriverContact create(DriverContact driverContact)
    {
        this.driverContacts.add(driverContact);
        return driverContact;
    }

    @Override
    public DriverContact update(DriverContact driverContact)
    {
        Iterator<DriverContact> it = this.driverContacts.iterator();

        while(it.hasNext())
        {
            if(this.driverContacts.contains(driverContact))
            {
                this.driverContacts.remove(driverContact);
                this.driverContacts.add(driverContact);
                break;
            }
            else
            {
                this.driverContacts.add(driverContact);
            }
            it.next();
        }
        return driverContact;
    }

    @Override
    public void delete(String s)
    {
        for (DriverContact driverCon: driverContacts)
        {
            if(driverCon.getPhone() == s)
            {
                driverContacts.remove(driverCon);
            }
        }
    }

    @Override
    public DriverContact read(String s)
    {
        DriverContact driver = new DriverContact.Builder().builder();
        for (DriverContact driverCon: driverContacts)
        {
            if(driverCon.getPhone() == s)
            {
                driver = driverCon;
            }
        }
        return driver;
    }
}
