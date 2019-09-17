package factoryTest.route;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.domain.route.Route;
import za.ac.cput.factory.route.RouteFactory;

public class RouteFactoryTest {

    @Test
    public void getRoute()
    {
        String routeNo ="",routeName= "", locationId="";

        Route rt = RouteFactory.getRoute(routeNo,routeName, locationId);

        Assert.assertNotNull(rt.getRouteName());
    }
}