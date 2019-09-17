package za.ac.cput.service.driver;

import za.ac.cput.domain.driver.DriverDetails;
import za.ac.cput.service.IService;

import java.util.Set;

public interface DriverDetailsService extends IService<DriverDetails, String> {
    Set<DriverDetails> getAll();
}
