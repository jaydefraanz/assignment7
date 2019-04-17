package FactoryTest.DriverTest;

import org.junit.Test;
import za.ac.cput.Domain.Driver.AssignedBus;
import za.ac.cput.Factory.Driver.AssignedBusFactory;

import static org.junit.Assert.*;

public class AssignedBusFactoryTest
{

    @Test
    public void getAssignedBus()
    {
        String busNo = "";
        String busName = "";
        String route = "205";

        AssignedBus assignBus = AssignedBusFactory.getAssignedBus(busNo,busName,route);

        assertTrue(assignBus.getRoute().length() > 0);
    }
}