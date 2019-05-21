package za.ac.cput.Service.Driver;

import za.ac.cput.Domain.Driver.DriverDetails;
import za.ac.cput.Service.IService;

import java.util.Set;

public interface DriverDetailsService extends IService<DriverDetails, String> {
    Set<DriverDetails> getAll();
}
