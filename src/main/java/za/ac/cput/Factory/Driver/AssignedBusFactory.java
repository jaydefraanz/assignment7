package za.ac.cput.Factory.Driver;

import za.ac.cput.Domain.Driver.AssignedBus;

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
