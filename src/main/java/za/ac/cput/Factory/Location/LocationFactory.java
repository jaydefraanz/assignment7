package za.ac.cput.Factory.Location;

import za.ac.cput.Domain.Location.Location;

public class LocationFactory {
    public static Location getLocation(String locationName, String locationNo)
    {
        return new Location.Builder()
                .locationName(locationName)
                .locationNo(locationNo)
                .build();
    }
}
