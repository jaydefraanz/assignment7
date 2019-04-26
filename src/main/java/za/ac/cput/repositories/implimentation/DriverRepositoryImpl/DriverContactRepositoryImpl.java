package za.ac.cput.repositories.implimentation.DriverRepositoryImpl;

import za.ac.cput.Domain.Driver.DriverContact;
import za.ac.cput.repositories.DriverRepository.DriverContactRepository;

import java.util.HashSet;
import java.util.Set;

public class DriverContactRepositoryImpl implements DriverContactRepository {

    private static DriverContactRepository repository = null;
    private Set<DriverContact> driverContacts;

    private DriverContactRepositoryImpl(){this.driverContacts = new HashSet<>();}

    private static DriverContactRepository getRepository()
    {
        if (repository == null) repository = new DriverContactRepositoryImpl();
        return  repository;
    }

    @Override
    public Set<DriverContact> getAll() {
        return null;
    }

    @Override
    public DriverContact create(DriverContact driverContact) {
        return null;
    }

    @Override
    public DriverContact update(DriverContact driverContact) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public DriverContact read(String s) {
        return null;
    }
}
