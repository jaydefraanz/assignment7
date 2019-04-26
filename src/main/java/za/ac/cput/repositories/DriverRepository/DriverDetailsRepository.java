package za.ac.cput.repositories.DriverRepository;

import za.ac.cput.Domain.Driver.DriverDetails;
import za.ac.cput.repositories.IRepository;

import java.util.Set;

public interface DriverDetailsRepository extends IRepository<DriverDetails,String>{
    Set<DriverDetails> getAll();
}
