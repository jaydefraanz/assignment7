package za.ac.cput.repositories.busRepository;

import za.ac.cput.domain.bus.BusDetails;
import za.ac.cput.repositories.IRepository;

import java.util.Set;

public interface BusDetailsRepository extends IRepository<BusDetails, String>
{
    Set<BusDetails> getAll();
}
