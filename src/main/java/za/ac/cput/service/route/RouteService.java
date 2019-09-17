package za.ac.cput.service.route;

import za.ac.cput.domain.route.Route;
import za.ac.cput.service.IService;

import java.util.Set;

public interface RouteService extends IService<Route,String> {
    Set<Route> getAll();
}
