package za.ac.cput.repositories.DriverRepository;

import za.ac.cput.Domain.Driver.AssignedBus;
import za.ac.cput.repositories.IRepository;

import java.util.Set;

public interface AssignedBusRepository extends IRepository<AssignedBus, String> {
    Set<AssignedBus> getAll();
}
