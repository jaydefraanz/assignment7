package za.ac.cput.factory.route;

import za.ac.cput.domain.route.DepartureStation;

public class DepartureStationFactory
{
    public static DepartureStation getDepartureStation(String stationId, String stationName)
    {
        return new DepartureStation.Builder()
                .stationId(stationId)
                .stationName(stationName)
                .build();
    }
}
