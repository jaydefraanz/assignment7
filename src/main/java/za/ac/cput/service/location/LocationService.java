package za.ac.cput.service.location;

import za.ac.cput.domain.location.Location;
import za.ac.cput.service.IService;

import java.util.Set;

public interface LocationService extends IService<Location, String> {
    Set<Location> getAll();
}
