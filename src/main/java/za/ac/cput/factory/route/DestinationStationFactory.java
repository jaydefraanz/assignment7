package za.ac.cput.factory.route;

import za.ac.cput.domain.route.DestinationStation;

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
