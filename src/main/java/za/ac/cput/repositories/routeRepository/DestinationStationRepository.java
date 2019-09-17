package za.ac.cput.repositories.routeRepository;

import za.ac.cput.domain.route.DestinationStation;
import za.ac.cput.repositories.IRepository;

import java.util.Set;

public interface DestinationStationRepository extends IRepository<DestinationStation, String> {
    Set<DestinationStation> getAll();
}
