package za.ac.cput.Service.Route;

import za.ac.cput.Domain.Route.DepartureStation;
import za.ac.cput.Service.IService;

import java.util.Set;

public interface DepartureStationService extends IService<DepartureStation, String> {
    Set<DepartureStation> getAll();
}
