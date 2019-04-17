package FactoryTest.Location;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.Domain.Location.Location;
import za.ac.cput.Factory.Location.LocationFactory;

public class LocationFactoryTest {

    @Test
    public void getLocation() {
        String locationName = "Cape Town";
        String locationNo ="201";

        Location lct = LocationFactory.getLocation(locationName,locationNo);

        Assert.assertNotNull(lct.getLocationName());
    }
}