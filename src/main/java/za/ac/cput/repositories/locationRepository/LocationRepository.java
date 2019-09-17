package za.ac.cput.repositories.locationRepository;

import za.ac.cput.domain.location.Location;
import za.ac.cput.repositories.IRepository;

import java.util.Set;

public interface LocationRepository extends IRepository<Location, String> {
    Set<Location> getAll();
}
