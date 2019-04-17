package za.ac.cput.Domain.Route;

public class StopLocation extends DestinationStation
{
    String stopName;

    public StopLocation(Builder builder) {
        this.stopName = builder.stopName;
    }

    public String getStopName() {
        return stopName;
    }

    public static class Builder extends DestinationStation.Builder {
        String stopName;

        public Builder stopName(String stopName) {
            this.stopName = stopName;
            return this;
        }

        public StopLocation build() {
            return new StopLocation(this);
        }
    }

    @Override
    public String toString() {
        return "StopLocation{" +
                "stopName='" + stopName + '\'' +
                ", stationId='" + stationId + '\'' +
                ", stationName='" + stationName + '\'' +
                ", routeNo='" + routeNo + '\'' +
                ", routeName='" + routeName + '\'' +
                ", locationId='" + locationId + '\'' +
                '}';
    }
}
