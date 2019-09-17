package za.ac.cput.service.driver;

import za.ac.cput.domain.driver.AssignedBus;
import za.ac.cput.service.IService;

import java.util.Set;

public interface AssignedBusService extends IService<AssignedBus, String> {
    Set<AssignedBus> getAll();
}
