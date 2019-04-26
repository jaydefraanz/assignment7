package za.ac.cput.repositories.RouteRepository;

import za.ac.cput.Domain.Route.Route;
import za.ac.cput.repositories.IRepository;

import java.util.Set;

public interface RouteRepository extends IRepository<Route,String> {
    Set<Route> getAll();
}
