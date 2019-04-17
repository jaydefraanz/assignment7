package za.ac.cput.Domain.Route;

public class DepartureStation extends Route
{
    String stationId, stationName;



    public DepartureStation(Builder builder) {
        super(builder);
        this.stationId = builder.stationId;
        stationName = builder.stationName;
    }

    public DepartureStation()
    {}


    public String getStationId() {
        return stationId;
    }

    public String getStationName() {
        return stationName;
    }

    public static class Builder extends Route.Builder {
        String stationId, stationName;

        public Builder stationId(String stationId) {
            this.stationId = stationId;
            return this;
        }
        public Builder stationName(String stationName) {
            this.stationName = stationName;
            return this;
        }

        public DepartureStation build()
        {
            return new DepartureStation(this);
        }
    }

    @Override
    public String toString() {
        return "DepartureStation{" +
                "stationId='" + stationId + '\'' +
                ", StationName='" + stationName + '\'' +
                ", routeNo='" + routeNo + '\'' +
                ", routeName='" + routeName + '\'' +
                ", locationId='" + locationId + '\'' +
                '}';
    }
}
