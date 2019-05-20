package za.ac.cput.repositories.implimentation.DriverRepositoryImpl;

import za.ac.cput.Domain.Driver.DriverDetails;
import za.ac.cput.repositories.DriverRepository.DriverDetailsRepository;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DriverDetailsRepositoryImpl implements DriverDetailsRepository {

    private static DriverDetailsRepository repository = null;
    private Set<DriverDetails> driverDetails;

    public DriverDetailsRepositoryImpl(){this.driverDetails = new HashSet<>(); }

    public static DriverDetailsRepository getRepository()
    {
        if(repository == null) repository = new DriverDetailsRepositoryImpl();
        return repository;
    }


    @Override
    public Set<DriverDetails> getAll()
    {
        return driverDetails;
    }

    @Override
    public DriverDetails create(DriverDetails driverDetails)
    {
        this.driverDetails.add(driverDetails);
        return driverDetails;
    }

    @Override
    public DriverDetails update(DriverDetails driverDetails)
    {
        Iterator<DriverDetails> it = this.driverDetails.iterator();

        while(it.hasNext())
        {
            if(this.driverDetails.contains(driverDetails))
            {
                this.driverDetails.remove(driverDetails);
                this.driverDetails.add(driverDetails);
                break;
            }
            else
            {
                this.driverDetails.add(driverDetails);
            }
            it.next();
        }
        return driverDetails;
    }

    @Override
    public void delete(String s)
    {
        for (DriverDetails driverDta: driverDetails)
        {
            if(driverDta.getIdNo() == s)
            {
                driverDetails.remove(driverDta);
            }
        }
    }

    @Override
    public DriverDetails read(String s)
    {
        DriverDetails dd = new DriverDetails.Builder().build();

        for (DriverDetails driverDta: driverDetails)
        {
            if(driverDta.getIdNo() == s)
            {
                dd = driverDta;
            }
        }
        return dd;
    }
}
