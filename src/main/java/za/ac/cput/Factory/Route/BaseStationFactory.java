package za.ac.cput.Factory.Route;

import za.ac.cput.Domain.Route.BaseStation;

public class BaseStationFactory
{
    public static BaseStation getBaseStation(String currentLocation)
    {
        return  new BaseStation.Builder()
                .currentLocation(currentLocation)
                .build();
    }
}
