package za.ac.cput.Domain.Location;

import java.util.Objects;

public class Location
{
    String locationName,locationNo;

    public Location(Builder builder)
    {
        this.locationName = builder.locationName;
        locationNo = builder.locationNo;
    }

    public String getLocationName() {
        return locationName;
    }

    public String getLocationNo() {
        return locationNo;
    }

    public static class Builder {
        String locationName,locationNo;

        public Builder locationName(String locationName) {
            this.locationName = locationName;
            return this;
        }
        public Builder locationNo(String locationNo) {
            this.locationNo = locationNo;
            return this;
        }

        public Location build()
        {
            return new Location(this);
        }
    }

    @Override
    public String toString() {
        return "Location{" +
                "locationName='" + locationName + '\'' +
                ", LocationNo='" + locationNo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return locationNo.equals(location.locationNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(locationNo);
    }
}
