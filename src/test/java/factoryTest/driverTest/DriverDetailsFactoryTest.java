package factoryTest.driverTest;

import org.junit.Test;
import za.ac.cput.domain.driver.DriverDetails;
import za.ac.cput.factory.driver.DriverDetailsFactory;

import static org.junit.Assert.assertNotNull;

public class DriverDetailsFactoryTest {

    @Test
    public void getDriverDetails()
    {
        String name = "";
        String surname = "";
        String idNo = "152415";

       DriverDetails dc = DriverDetailsFactory.getDriverDetail(name,surname,idNo);

       assertNotNull(dc.getName());


    }
}