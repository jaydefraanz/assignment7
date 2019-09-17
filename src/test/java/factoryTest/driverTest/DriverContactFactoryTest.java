package factoryTest.driverTest;

import org.junit.Test;
import za.ac.cput.domain.driver.DriverContact;
import za.ac.cput.factory.driver.DriverContactFactory;

import static org.junit.Assert.*;

public class DriverContactFactoryTest {

    @Test
    public void getDriverContact()
    {
        String phone = "";
        String email = "";
        String address = "Cape Town";

        DriverContact driverCon = DriverContactFactory.getDriverContact(phone,email,address);

        assertTrue(phone.length()>0);
    }
}