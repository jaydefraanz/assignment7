package za.ac.cput.Domain.Location;

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
}
