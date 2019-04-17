package FactoryTest.DriverTest;

import org.junit.Test;
import za.ac.cput.Domain.Driver.DriverContact;
import za.ac.cput.Factory.Driver.DriverContactFactory;

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