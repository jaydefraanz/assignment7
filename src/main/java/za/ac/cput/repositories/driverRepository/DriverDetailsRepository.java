package za.ac.cput.repositories.driverRepository;

import za.ac.cput.domain.driver.DriverDetails;
import za.ac.cput.repositories.IRepository;

import java.util.Set;

public interface DriverDetailsRepository extends IRepository<DriverDetails,String>{
    Set<DriverDetails> getAll();
}
