package za.ac.cput.Service.Driver;

import za.ac.cput.Domain.Driver.DriverContact;
import za.ac.cput.Service.IService;

import java.util.Set;

public interface DriverContactService  extends IService<DriverContact, String> {
    Set<DriverContact> getAll();
}
