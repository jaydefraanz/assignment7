package za.ac.cput.service.bus;

import za.ac.cput.domain.bus.BusDetails;
import za.ac.cput.service.IService;

import java.util.Set;

public interface BusDetailsService extends IService<BusDetails, String> {
    Set<BusDetails> getAll();
}
