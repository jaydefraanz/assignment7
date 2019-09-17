package za.ac.cput.factory.route;

import za.ac.cput.domain.route.BaseStation;

public class BaseStationFactory
{
    public static BaseStation getBaseStation(String currentLocation)
    {
        return  new BaseStation.Builder()
                .currentLocation(currentLocation)
                .build();
    }
}
