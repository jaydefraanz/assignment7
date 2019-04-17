package za.ac.cput.Factory.Route;

import za.ac.cput.Domain.Route.Route;

public class RouteFactory
{
    public static Route getRoute(String routeNo,String routeName, String locationId)
    {
        return new Route.Builder()
                .routeName(routeName)
                .routeNo(routeNo)
                .locationId(locationId)
                .build();
    }
}
