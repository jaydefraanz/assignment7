package FactoryTest.Route;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.Domain.Route.DepartureStation;
import za.ac.cput.Factory.Route.DepartureStationFactory;

import static org.junit.Assert.*;

public class DepartureStationFactoryTest {

    @Test
    public void getDpartureStation(){

        String stationId = "5214", stationName ="";

        DepartureStation ds = DepartureStationFactory.getDepartureStation(stationId,stationName);

        Assert.assertNotNull(ds.getStationName());
    }
}