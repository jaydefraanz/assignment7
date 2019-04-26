package za.ac.cput.repositories.RouteRepository;

import za.ac.cput.Domain.Route.DestinationStation;
import za.ac.cput.repositories.IRepository;

import java.util.Set;

public interface DestinationStationRepository extends IRepository<DestinationStation, String> {
    Set<DestinationStation> getAll();
}
