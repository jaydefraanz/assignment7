package za.ac.cput.Domain.Route;

import java.util.Objects;

//Determines the departureStation
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        DepartureStation that = (DepartureStation) o;
        return stationId.equals(that.stationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), stationId);
    }
}
