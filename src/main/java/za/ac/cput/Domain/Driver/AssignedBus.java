package za.ac.cput.Domain.Driver;

public class AssignedBus
{
    String busNo, busName, route;

    public AssignedBus(Builder builder) {
        this.busNo = builder.busNo;
        this.busName = builder.busName;
        this.route = builder.route;
    }

    public String getBusNo() {
        return busNo;
    }

    public String getBusName() {
        return busName;
    }

    public String getRoute() {
        return route;
    }

    public static class Builder
    {
        String busNo, busName, route;

        public Builder busNo(String busNo)
        {
            this.busNo = busNo;
            return this;
        }
        public Builder busName(String busName)
        {
            this.busName = busName;
            return this;
        }
        public Builder route(String route)
        {
            this.route = route;
            return this;
        }

        public AssignedBus build()
        {
            return new AssignedBus(this);
        }

    }

    @Override
    public String toString() {
        return "AssignedBus{" +
                "busNo='" + busNo + '\'' +
                ", busName='" + busName + '\'' +
                ", route='" + route + '\'' +
                '}';
    }
}
