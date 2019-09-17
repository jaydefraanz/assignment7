package za.ac.cput.factory.fee;

import za.ac.cput.domain.fee.PublicHolidayFee;

public class PublicHolidayFeeFactory
{
    public static PublicHolidayFee getPublicHolidayFee(double price)
    {
        return new PublicHolidayFee.Builder()
                .totalPrice(price)
                .build();
    }

}
