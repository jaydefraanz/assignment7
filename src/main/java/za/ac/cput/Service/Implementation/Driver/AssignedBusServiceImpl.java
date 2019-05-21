package za.ac.cput.Service.Implementation.Driver;

import za.ac.cput.Domain.Driver.AssignedBus;
import za.ac.cput.Domain.Driver.DriverDetails;
import za.ac.cput.Service.Driver.AssignedBusService;
import za.ac.cput.repositories.DriverRepository.AssignedBusRepository;
import za.ac.cput.repositories.implimentation.DriverRepositoryImpl.AssignedBusRepositoryImpl;

import java.util.Set;

public class AssignedBusServiceImpl implements AssignedBusService {

    private static AssignedBusServiceImpl service = null;
    private AssignedBusRepository repository;

    private AssignedBusServiceImpl(){this.repository = AssignedBusRepositoryImpl.getRepository(); }

    private static AssignedBusServiceImpl getService()
    {
        if(service == null) service = new AssignedBusServiceImpl();
        return service;
    }

    @Override
    public Set<AssignedBus> getAll() {
        return repository.getAll();
    }

    @Override
    public AssignedBus create(AssignedBus assignedBus) {
        return repository.create(assignedBus);
    }

    @Override
    public AssignedBus update(AssignedBus assignedBus) {
        return repository.update(assignedBus);
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
