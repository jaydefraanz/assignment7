package za.ac.cput.repositories.implimentation.DriverRepositoryImpl;

import za.ac.cput.Domain.Driver.DriverDetails;
import za.ac.cput.repositories.DriverRepository.DriverDetailsRepository;

import java.util.HashSet;
import java.util.Set;

public class DriverDetailsRepositoryImpl implements DriverDetailsRepository {

    private static DriverDetailsRepository repository = null;
    private Set<DriverDetails> driverDetails;

    private DriverDetailsRepositoryImpl(){this.driverDetails = new HashSet<>(); }

    public static DriverDetailsRepository getRepository()
    {
        if(repository == null) repository = new DriverDetailsRepositoryImpl();
        return repository;
    }


    @Override
    public Set<DriverDetails> getAll() {
        return null;
    }

    @Override
    public DriverDetails create(DriverDetails driverDetails) {
        return null;
    }

    @Override
    public DriverDetails update(DriverDetails driverDetails) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public DriverDetails read(String s) {
        return null;
    }
}
