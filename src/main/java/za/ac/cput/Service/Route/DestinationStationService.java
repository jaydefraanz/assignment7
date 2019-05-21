package za.ac.cput.Service.Route;

import za.ac.cput.Domain.Route.DestinationStation;
import za.ac.cput.Service.IService;

import java.util.Set;

public interface DestinationStationService extends IService<DestinationStation, String> {
    Set<DestinationStation> getAll();
}
