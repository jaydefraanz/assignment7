package za.ac.cput.Domain.Fee;

public class WeekendFee implements Price
{
    double price, distance, totalPrice,increase;

    public WeekendFee() {
    }

    public WeekendFee(Builder builder) {
        this.totalPrice = builder.totalPrice;
    }

    @Override
    public double ActualFee()
    {
        increase = (price * distance) * 0.03;
        totalPrice = increase + (price * distance);
        return totalPrice;
    }

    public static class Builder
    {
        double totalPrice;

        public Builder totalPrice(double totalPrice)
        {
            this.totalPrice = totalPrice;
            return this;
        }

        public WeekendFee build(){return  new WeekendFee(this);}
    }

    @Override
    public String toString() {
        return "WeekendFee{" +
                "price=" + price +
                ", distance=" + distance +
                ", totalPrice=" + totalPrice +
                ", increase=" + increase +
                '}';
    }
}
