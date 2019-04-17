package za.ac.cput.Domain.Route;

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
        return "Route{" +
                "routeNo='" + routeNo + '\'' +
                ", routeName='" + routeName + '\'' +
                ", locationId='" + locationId + '\'' +
                '}';
    }
}
