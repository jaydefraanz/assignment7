package za.ac.cput.Domain.Route;

public class BaseStation extends DepartureStation
{
    String currentLocation;

    public BaseStation(Builder builder) {
        super(builder);
        this.currentLocation = currentLocation;
    }


    public String getCurrentLocation() {
        return currentLocation;
    }

    public static class Builder extends DepartureStation.Builder{
        String currentLocation;

        public Builder currentLocation(String currentLocation) {
            this.currentLocation = currentLocation;
            return this;
        }

        public BaseStation build()
        {
            return new BaseStation(this);
        }
    }

    @Override
    public String toString() {
        return "BaseStation{" +
                "currentLocation='" + currentLocation + '\'' +
                ", stationId='" + stationId + '\'' +
                ", stationName='" + stationName + '\'' +
                ", routeNo='" + routeNo + '\'' +
                ", routeName='" + routeName + '\'' +
                ", locationId='" + locationId + '\'' +
                '}';
    }
}
