package za.ac.cput.repositories.routeRepository;

import za.ac.cput.domain.route.DepartureStation;
import za.ac.cput.repositories.IRepository;

import java.util.Set;

public interface DepartureStationRepository extends IRepository<DepartureStation, String> {
    Set<DepartureStation> getAll();
}
