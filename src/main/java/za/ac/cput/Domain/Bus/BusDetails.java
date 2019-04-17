package za.ac.cput.Domain.Bus;

public class BusDetails {
    String busNo, busName, busSeats;

    public BusDetails() {
    }

    public BusDetails(Builder builder) {
        this.busNo = builder.busNo;
        this.busName = builder.busName;
        this.busSeats = builder.busSeats;
    }

    public String getBusNo() {
        return busNo;
    }

    public String getBusName() {
        return busName;
    }

    public String getBusSeats() {
        return busSeats;
    }

    public static class Builder {
        String busNo, busName, busSeats;

        public Builder busNo(String busNo) {
            this.busNo = busNo;
            return this;
        }
        public Builder busName(String busName) {
            this.busName = busName;
            return this;
        }
        public Builder busSeats(String busSeats) {
            this.busSeats = busSeats;
            return this;
        }

        public BusDetails build()
        {
            return new BusDetails(this);
        }

    }

    @Override
    public String toString() {
        return "BusDetails{" +
                "busNo='" + busNo + '\'' +
                ", busName='" + busName + '\'' +
                ", busSeats='" + busSeats + '\'' +
                '}';
    }
}
