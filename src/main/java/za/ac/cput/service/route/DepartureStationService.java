package za.ac.cput.service.route;

import za.ac.cput.domain.route.DepartureStation;
import za.ac.cput.service.IService;

import java.util.Set;

public interface DepartureStationService extends IService<DepartureStation, String> {
    Set<DepartureStation> getAll();
}
