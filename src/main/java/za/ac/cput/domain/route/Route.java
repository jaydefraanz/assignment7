package za.ac.cput.domain.route;

import java.util.Objects;

public class Route
{


    String routeNo,routeName, locationId;

    public Route() {
    }

    public Route(Builder builder) {
        this.routeNo = builder.routeNo;
        this.routeName = builder.routeName;
        this.locationId = builder.locationId;
    }

    public String getRouteNo() {
        return routeNo;
    }

    public String getRouteName() {
        return routeName;
    }

    public String getLocationId() {
        return locationId;
    }

    public static class Builder {
        String routeNo,routeName, locationId;

        public Builder routeNo(String routeNo) {
            this.routeNo = routeNo;
            return this;
        }
        public Builder routeName(String routeName) {
            this.routeName = routeName;
            return this;
        }
        public Builder locationId(String locationId) {
            this.locationId = locationId;
            return this;
        }

        public Route build()
        {
            return new Route(this);
        }
    }

    @Override
    public String toString() {
        return "route{" +
                "routeNo='" + routeNo + '\'' +
                ", routeName='" + routeName + '\'' +
                ", locationId='" + locationId + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Route route = (Route) o;
        return routeNo.equals(route.routeNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(routeNo);
    }
}
