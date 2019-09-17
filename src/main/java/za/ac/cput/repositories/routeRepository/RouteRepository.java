package za.ac.cput.repositories.routeRepository;

import za.ac.cput.domain.route.Route;
import za.ac.cput.repositories.IRepository;

import java.util.Set;

public interface RouteRepository extends IRepository<Route,String> {
    Set<Route> getAll();
}
