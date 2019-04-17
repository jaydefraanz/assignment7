package FactoryTest.BusTest;

import org.junit.Test;
import za.ac.cput.Domain.Bus.BusDetails;
import za.ac.cput.Factory.Bus.BusDetailsFactory;

import static org.junit.Assert.*;

public class BusDetailsFactoryTest {

    @Test
    public void getBusDetails() {
        String busNo = "024";
        String busName = "";
        String seats = "";

        BusDetails bd = BusDetailsFactory.getBusDetails(busNo,busName,seats);

        assertTrue(bd.getBusName().length() > 0);
    }
}