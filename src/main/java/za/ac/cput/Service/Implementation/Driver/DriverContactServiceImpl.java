package za.ac.cput.Service.Implementation.Driver;

import za.ac.cput.Domain.Driver.DriverContact;
import za.ac.cput.Domain.Driver.DriverDetails;
import za.ac.cput.Service.Driver.DriverContactService;
import za.ac.cput.repositories.DriverRepository.DriverContactRepository;
import za.ac.cput.repositories.implimentation.DriverRepositoryImpl.DriverContactRepositoryImpl;

import java.util.Set;

public class DriverContactServiceImpl implements DriverContactService {

    private static DriverContactServiceImpl service = null;
    private DriverContactRepository repository;

    private DriverContactServiceImpl(){this.repository = DriverContactRepositoryImpl.getRepository();}

    private static DriverContactServiceImpl getService()
    {
        if(service == null) service = new DriverContactServiceImpl();
        return service;
    }

    @Override
    public Set<DriverDetails> getAll() {
        return repository.getAll();
    }

    @Override
    public DriverContact create(DriverContact driverContact) {
        return repository.create(driverContact);
    }

    @Override
    public DriverContact update(DriverContact driverContact) {
        return repository.update(driverContact);
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
