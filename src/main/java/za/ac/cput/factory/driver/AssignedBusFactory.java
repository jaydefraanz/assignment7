package za.ac.cput.factory.driver;

import za.ac.cput.domain.driver.AssignedBus;

public class AssignedBusFactory
{
    public static AssignedBus getAssignedBus(String busNo, String busName, String route)
    {
        return new AssignedBus.Builder()
                .busName(busName)
                .busNo(busNo)
                .route(route)
                .build();
    }
}
