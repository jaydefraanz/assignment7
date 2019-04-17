package za.ac.cput.Factory.Route;

import za.ac.cput.Domain.Route.DepartureStation;

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
