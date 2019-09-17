package factoryTest.route;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.domain.route.BaseStation;
import za.ac.cput.factory.route.BaseStationFactory;

public class BaseStationFactoryTest {

    @Test
    public void getBaseStation() {
        String currentLocation = "105";

        BaseStation bs = BaseStationFactory.
                getBaseStation(currentLocation);

        Assert.assertNotNull(bs.getCurrentLocation());
    }
}