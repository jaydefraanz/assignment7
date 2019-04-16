package za.ac.cput.Domain.Fee;

public class OffPeakFee implements Price
{
    int distance;
    double price,totalPrice;

    public OffPeakFee(Builder builder)
    {
        this.totalPrice = builder.totalPrice;
    }

    @Override
    public double ActualFee() {
        totalPrice = distance*price;
        return totalPrice;
    }

    public static class Builder
    {
        double totalPrice;

        public Builder totaPrice(double totalPrice)
        {
            this.totalPrice = totalPrice;
            return this;
        }

        public OffPeakFee build(){return new OffPeakFee(this);}

    }

    @Override
    public String toString() {
        return "OffPeakFee{" +
                "distance=" + distance +
                ", price=" + price +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
