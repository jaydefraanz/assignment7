package za.ac.cput.Service.Bus;

import za.ac.cput.Domain.Bus.BusDetails;
import za.ac.cput.Service.IService;

import java.util.Set;

public interface BusDetailsService extends IService<BusDetails, String> {
    Set<BusDetails> getAll();
}
