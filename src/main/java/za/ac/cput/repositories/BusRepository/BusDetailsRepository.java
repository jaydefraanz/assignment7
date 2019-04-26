package za.ac.cput.repositories.BusRepository;

import za.ac.cput.Domain.Bus.BusDetails;
import za.ac.cput.repositories.IRepository;

import java.util.Set;

public interface BusDetailsRepository extends IRepository<BusDetails, String>
{
    Set<BusDetails> getAll();
}
