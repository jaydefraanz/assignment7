package za.ac.cput.Factory.Route;

import za.ac.cput.Domain.Route.DestinationStation;

public class DestinationStationFactory
{
    public static DestinationStation getDestinationStation(String stationId, String stationName)
    {
        return new DestinationStation.Builder()
                .stationId(stationId)
                .stationName(stationName)
                .build();
    }
}
