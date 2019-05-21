package za.ac.cput.Service.Driver;

import za.ac.cput.Domain.Driver.AssignedBus;
import za.ac.cput.Service.IService;

import java.util.Set;

public interface AssignedBusService extends IService<AssignedBus, String> {
    Set<AssignedBus> getAll();
}
