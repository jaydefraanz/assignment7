package za.ac.cput.service.driver;

import za.ac.cput.domain.driver.DriverContact;
import za.ac.cput.service.IService;

import java.util.Set;

public interface DriverContactService  extends IService<DriverContact, String> {
    Set<DriverContact> getAll();
}
