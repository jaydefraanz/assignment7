package factoryTest.route;

import org.junit.Test;
import za.ac.cput.domain.route.StopLocation;
import za.ac.cput.factory.route.StopLocationFactory;

import static org.junit.Assert.assertNotNull;


public class StopLocationFactoryTest {

    @Test
    public void getStopLocation()
    {
        String stopName = "Newfields";

        StopLocation sl = StopLocationFactory.getStopLocation(stopName);

        assertNotNull(sl.getStopName());

    }
}