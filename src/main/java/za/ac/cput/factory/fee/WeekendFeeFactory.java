package za.ac.cput.factory.fee;

import za.ac.cput.domain.fee.WeekendFee;

public class WeekendFeeFactory
{
    public static WeekendFee getWeekendFee(double price)
    {
        return new WeekendFee.Builder()
                .totalPrice(price)
                .build();
    }

}
