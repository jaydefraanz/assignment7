package za.ac.cput.Factory.Route;

import za.ac.cput.Domain.Route.StopLocation;

public class StopLocationFactory
{
    public static StopLocation getStopLocation(String stopName)
    {
        return new StopLocation.Builder()
                .stopName(stopName)
                .build();

    }

}
