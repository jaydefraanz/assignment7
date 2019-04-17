package FactoryTest.Route;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.Domain.Route.Route;
import za.ac.cput.Factory.Route.RouteFactory;

public class RouteFactoryTest {

    @Test
    public void getRoute()
    {
        String routeNo ="",routeName= "", locationId="";

        Route rt = RouteFactory.getRoute(routeNo,routeName, locationId);

        Assert.assertNotNull(rt.getRouteName());
    }
}