package za.ac.cput.Service.Implementation.Driver;

import za.ac.cput.Domain.Driver.DriverContact;
import za.ac.cput.Domain.Driver.DriverDetails;
import za.ac.cput.Service.Driver.DriverContactService;
import za.ac.cput.repositories.DriverRepository.DriverDetailsRepository;
import za.ac.cput.repositories.implimentation.DriverRepositoryImpl.DriverDetailsRepositoryImpl;

import java.util.Set;

public class DriverDetailsServiceImpl  implements DriverContactService {

    private static DriverDetailsServiceImpl service = null;
    private DriverDetailsRepository repository;

    private DriverDetailsServiceImpl(){this.repository = DriverDetailsRepositoryImpl.getRepository(); }

    private static DriverDetailsServiceImpl getService()
    {
        if(service == null) service = new DriverDetailsServiceImpl();
        return service;
    }

    @Override
    public Set<DriverDetails> getAll() {
        return repository.getAll();
    }

    public DriverDetails create(DriverDetails driverDetails) {
        return repository.create(driverDetails);
    }

    public DriverDetails update(DriverDetails driverDetails) {
        return repository.update(driverDetails);
    }

    @Override
    public DriverContact create(DriverContact type) {
        return null;
    }

    @Override
    public DriverContact update(DriverContact type) {
        return null;
    }

    @Override
    public void delete(String s) {
        repository.delete(s);
    }

    @Override
    public DriverDetails read(String s) {
        return repository.read(s);
    }
}