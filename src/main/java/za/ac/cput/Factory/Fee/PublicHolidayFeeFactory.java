package za.ac.cput.Factory.Fee;

import za.ac.cput.Domain.Fee.PublicHolidayFee;

public class PublicHolidayFeeFactory
{
    public static PublicHolidayFee getPublicHolidayFee(double price)
    {
        return new PublicHolidayFee.Builder()
                .totalPrice(price)
                .build();
    }

}
