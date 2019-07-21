package FactoryTest.Route;

import org.junit.Test;
import za.ac.cput.Domain.Route.StopLocation;
import za.ac.cput.Factory.Route.StopLocationFactory;

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