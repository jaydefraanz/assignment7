package factoryTest.route;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.domain.route.DepartureStation;
import za.ac.cput.factory.route.DepartureStationFactory;

public class DepartureStationFactoryTest {

    @Test
    public void getDpartureStation(){

        String stationId = "5214", stationName ="";

        DepartureStation ds = DepartureStationFactory.getDepartureStation(stationId,stationName);

        Assert.assertNotNull(ds.getStationName());
    }
}