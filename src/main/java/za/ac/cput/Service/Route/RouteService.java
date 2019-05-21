package za.ac.cput.Service.Route;

import za.ac.cput.Domain.Route.Route;
import za.ac.cput.Service.IService;

import java.util.Set;

public interface RouteService extends IService<Route,String> {
    Set<Route> getAll();
}
