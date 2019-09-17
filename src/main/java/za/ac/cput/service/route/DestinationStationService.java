package za.ac.cput.service.route;

import za.ac.cput.domain.route.DestinationStation;
import za.ac.cput.service.IService;

import java.util.Set;

public interface DestinationStationService extends IService<DestinationStation, String> {
    Set<DestinationStation> getAll();
}
