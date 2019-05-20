package za.ac.cput.repositories.implimentation.RouteRepositoryImpl;

import za.ac.cput.Domain.Route.Route;
import za.ac.cput.repositories.RouteRepository.RouteRepository;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RouteRepositoryImpl implements RouteRepository {

   private static RouteRepository repository = null;
   private Set<Route> routes;

   public RouteRepositoryImpl(){this.routes = new HashSet<>(); }

   public static RouteRepository getRepository()
   {
       if(repository == null) repository = new RouteRepositoryImpl();
       return  repository;
   }

    @Override
    public Set<Route> getAll() {
        return routes;
    }

    @Override
    public Route create(Route route)
    {
        this.routes.add(route);
        return route;
    }

    @Override
    public Route update(Route route)
    {
        Iterator<Route> it = this.routes.iterator();

        while(it.hasNext())
        {
            if(this.routes.contains(route))
            {
                this.routes.remove(route);
                this.routes.add(route);
                break;
            }
            else
            {
                this.routes.add(route);
            }
            it.next();
        }
        return route;
    }

    @Override
    public void delete(String s)
    {
        for (Route rt: routes)
        {
            if(rt.getRouteNo() == s)
            {
                routes.remove(rt);
            }
        }
    }

    @Override
    public Route read(String s)
    {
        Route rte = new Route.Builder().build();

        for (Route rt: routes)
        {
            if(rt.getRouteNo() == s)
            {
                rte = rt;
            }
        }
        return rte;
    }
}
