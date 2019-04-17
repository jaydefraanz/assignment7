package FactoryTest.Route;

import junit.framework.Assert;
import org.junit.Test;
import za.ac.cput.Domain.Route.StopLocation;
import za.ac.cput.Factory.Route.StopLocationFactory;

import static org.junit.Assert.*;

public class StopLocationFactoryTest {

    @Test
    public void getStopLocation()
    {
        String stopName = "Newfields";

        StopLocation sl = StopLocationFactory.getStopLocation(stopName);

        Assert.assertNotNull(sl.getStopName());

    }
}