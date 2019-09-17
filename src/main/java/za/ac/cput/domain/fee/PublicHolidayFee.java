package za.ac.cput.domain.fee;

public class PublicHolidayFee implements Price
{
    double price, distance, totalPrice,increase;

    public PublicHolidayFee(Builder builder)
    {
        this.price = builder.price;
    }

    @Override
    public double ActualFee()
    {
        increase = (price * distance) * 0.05;
        totalPrice = increase + (price * distance);
        return totalPrice;
    }

    public static class Builder
    {
        double price;

        public Builder totalPrice(double totalPrice)
        {
            this.price = totalPrice;
            return this;
        }

        public PublicHolidayFee build(){return new PublicHolidayFee(this);}
    }

    @Override
    public String toString()
    {
        return "PublicHolidayFeeFactory{" +
                "price=" + price +
                ", distance=" + distance +
                ", totalPrice=" + totalPrice +
                ", increase=" + increase +
                '}';
    }
}
