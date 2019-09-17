package za.ac.cput.domain.route;

import java.util.Objects;

//Determines the StopLocation
public class DestinationStation extends Route
{
    String stationId, stationName;

    public DestinationStation(Builder builder) {
        super(builder);
        this.stationId = builder.stationId;
        stationName = builder.stationName;
    }

    public DestinationStation(){}

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

        public DestinationStation build()
        {
            return new DestinationStation(this);
        }
    }

    @Override
    public String toString() {
        return "DestinationStation{" +
                "stationId='" + stationId + '\'' +
                ", stationName='" + stationName + '\'' +
                ", routeNo='" + routeNo + '\'' +
                ", routeName='" + routeName + '\'' +
                ", locationId='" + locationId + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        DestinationStation that = (DestinationStation) o;
        return stationId.equals(that.stationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), stationId);
    }
}