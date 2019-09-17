package za.ac.cput.repositories.driverRepository;

import za.ac.cput.domain.driver.DriverContact;
import za.ac.cput.repositories.IRepository;

import java.util.Set;

public interface DriverContactRepository extends IRepository<DriverContact,String> {
    Set<DriverContact> getAll();
}
