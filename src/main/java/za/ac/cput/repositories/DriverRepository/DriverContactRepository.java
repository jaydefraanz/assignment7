package za.ac.cput.repositories.DriverRepository;

import za.ac.cput.Domain.Driver.DriverContact;
import za.ac.cput.repositories.IRepository;

import java.util.Set;

public interface DriverContactRepository extends IRepository<DriverContact,String> {
    Set<DriverContact> getAll();
}
