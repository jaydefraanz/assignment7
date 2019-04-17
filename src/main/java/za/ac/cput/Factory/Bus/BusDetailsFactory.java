package za.ac.cput.Factory.Bus;

import za.ac.cput.Domain.Bus.BusDetails;

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
