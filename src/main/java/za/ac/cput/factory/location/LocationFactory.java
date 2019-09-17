package za.ac.cput.factory.location;

import za.ac.cput.domain.location.Location;

public class LocationFactory {
    public static Location getLocation(String locationName, String locationNo)
    {
        return new Location.Builder()
                .locationName(locationName)
                .locationNo(locationNo)
                .build();
    }
}
