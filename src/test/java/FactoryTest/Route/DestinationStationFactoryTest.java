package FactoryTest.Route;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.Domain.Route.DestinationStation;
import za.ac.cput.Factory.Route.DestinationStationFactory;

import static org.junit.Assert.*;

public class DestinationStationFactoryTest {

    @Test
    public void getDestinationStation()
    {
        String stationId = "614", stationName ="";

        DestinationStation ds = DestinationStationFactory.getDestinationStation(stationId,stationName);

        Assert.assertNotNull(ds.getStationName());
    }
}