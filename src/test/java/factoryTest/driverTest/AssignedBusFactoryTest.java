package factoryTest.driverTest;

import org.junit.Test;
import za.ac.cput.domain.driver.AssignedBus;
import za.ac.cput.factory.driver.AssignedBusFactory;

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