package factoryTest.location;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.domain.location.Location;
import za.ac.cput.factory.location.LocationFactory;

public class LocationFactoryTest {

    @Test
    public void getLocation() {
        String locationName = "Cape Town";
        String locationNo ="201";

        Location lct = LocationFactory.getLocation(locationName,locationNo);

        Assert.assertNotNull(lct.getLocationName());
    }
}