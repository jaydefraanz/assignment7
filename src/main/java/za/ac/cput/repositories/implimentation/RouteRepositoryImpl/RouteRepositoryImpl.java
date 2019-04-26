package za.ac.cput.repositories.implimentation.RouteRepositoryImpl;

import za.ac.cput.Domain.Route.Route;
import za.ac.cput.repositories.RouteRepository.RouteRepository;

import java.util.HashSet;
import java.util.Set;

public class RouteRepositoryImpl implements RouteRepository {

   private static RouteRepository repository = null;
   private Set<Route> routes;

   private RouteRepositoryImpl(){this.routes = new HashSet<>(); }

   public static RouteRepository getRepository()
   {
       if(repository == null) repository = new RouteRepositoryImpl();
       return  repository;
   }

    @Override
    public Set<Route> getAll() {
        return null;
    }

    @Override
    public Route create(Route route) {
        return null;
    }

    @Override
    public Route update(Route route) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public Route read(String s) {
        return null;
    }
}
