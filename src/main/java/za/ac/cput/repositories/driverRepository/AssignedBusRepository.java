package za.ac.cput.repositories.driverRepository;

import za.ac.cput.domain.driver.AssignedBus;
import za.ac.cput.repositories.IRepository;

import java.util.Set;

public interface AssignedBusRepository extends IRepository<AssignedBus, String> {
    Set<AssignedBus> getAll();
}
