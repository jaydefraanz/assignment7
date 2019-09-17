package za.ac.cput.factory.route;

import za.ac.cput.domain.route.Route;

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
