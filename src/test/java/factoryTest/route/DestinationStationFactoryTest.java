package factoryTest.route;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.domain.route.DestinationStation;
import za.ac.cput.factory.route.DestinationStationFactory;

public class DestinationStationFactoryTest {

    @Test
    public void getDestinationStation()
    {
        String stationId = "614", stationName ="";

        DestinationStation ds = DestinationStationFactory.getDestinationStation(stationId,stationName);

        Assert.assertNotNull(ds.getStationName());
    }
}