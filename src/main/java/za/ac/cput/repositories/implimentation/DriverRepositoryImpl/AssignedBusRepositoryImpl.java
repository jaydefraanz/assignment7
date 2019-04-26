package za.ac.cput.repositories.implimentation.DriverRepositoryImpl;

import za.ac.cput.Domain.Driver.AssignedBus;
import za.ac.cput.repositories.DriverRepository.AssignedBusRepository;

import java.util.HashSet;
import java.util.Set;

public class AssignedBusRepositoryImpl implements AssignedBusRepository {

    private  static AssignedBusRepository repository = null;
    private Set<AssignedBus> assignedBuses;

    private AssignedBusRepositoryImpl(){this.assignedBuses = new HashSet<>(); }

    public static AssignedBusRepository getRepository()
    {
        if (repository == null) repository = new AssignedBusRepositoryImpl();
        return repository;
    }


    @Override
    public Set<AssignedBus> getAll() {
        return null;
    }

    @Override
    public AssignedBus create(AssignedBus assignedBus) {
        return null;
    }

    @Override
    public AssignedBus update(AssignedBus assignedBus) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public AssignedBus read(String s) {
        return null;
    }
}
