package za.ac.cput.factory.bus;

import za.ac.cput.domain.bus.BusDetails;

public class BusDetailsFactory
{
    public static BusDetails getBusDetails(String busNo,String busName,String seats)
    {
        return new BusDetails.Builder()
                .busName(busName)
                .busNo(busNo)
                .busSeats(seats)
                .build();
    }
}
