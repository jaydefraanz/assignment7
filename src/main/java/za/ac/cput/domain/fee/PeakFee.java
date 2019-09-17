package za.ac.cput.domain.fee;

public class PeakFee implements Price {
    int distance;
    double price, peakIncrease, totalPrice;

    //price is per kilometer
    //distance is the kilometers travelled


    public PeakFee(Builder builder) {
        this.totalPrice = builder.totalPrice;
    }

    @Override
    public double ActualFee() {
        //2% increase during peak hours
        peakIncrease = (price * distance) * 0.02;
        totalPrice = (price * distance) + peakIncrease;
        return totalPrice;
    }

    public static class Builder {
        double totalPrice;

        public Builder totalPrice(double totalPrice) {
            this.totalPrice = totalPrice;
            return this;
        }

        public PeakFee build() {
            return new PeakFee(this);
        }
    }

    @Override
    public String toString() {
        return "PeakFee{" +
                "distance=" + distance +
                ", price=" + price +
                ", peakIncrease=" + peakIncrease +
                ", totalPrice=" + totalPrice +
                '}';
    }
}