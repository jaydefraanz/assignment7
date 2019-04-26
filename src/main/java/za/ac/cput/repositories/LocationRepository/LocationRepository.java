package za.ac.cput.repositories.LocationRepository;

import za.ac.cput.Domain.Location.Location;
import za.ac.cput.repositories.IRepository;

import java.util.Set;

public interface LocationRepository extends IRepository<Location, String> {
    Set<Location> getAll();
}
