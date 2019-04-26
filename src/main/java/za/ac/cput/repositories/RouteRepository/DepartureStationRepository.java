package za.ac.cput.repositories.RouteRepository;

import za.ac.cput.Domain.Route.DepartureStation;
import za.ac.cput.repositories.IRepository;

import java.util.Set;

public interface DepartureStationRepository extends IRepository<DepartureStation, String> {
    Set<DepartureStation> getAll();
}
