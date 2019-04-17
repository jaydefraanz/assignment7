package FactoryTest.Route;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.Domain.Route.BaseStation;
import za.ac.cput.Factory.Route.BaseStationFactory;

public class BaseStationFactoryTest {

    @Test
    public void getBaseStation() {
        String currentLocation = "105";

        BaseStation bs = BaseStationFactory.
                getBaseStation(currentLocation);

        Assert.assertNotNull(bs.getCurrentLocation());
    }
}