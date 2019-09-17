package za.ac.cput.factory.route;

import za.ac.cput.domain.route.StopLocation;

public class StopLocationFactory
{
    public static StopLocation getStopLocation(String stopName)
    {
        return new StopLocation.Builder()
                .stopName(stopName)
                .build();

    }

}
