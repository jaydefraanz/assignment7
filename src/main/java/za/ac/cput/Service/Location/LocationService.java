package za.ac.cput.Service.Location;

import za.ac.cput.Domain.Location.Location;
import za.ac.cput.Service.IService;

import java.util.Set;

public interface LocationService extends IService<Location, String> {
    Set<Location> getAll();
}
