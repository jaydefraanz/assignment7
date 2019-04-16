package za.ac.cput.FactoryTest.Fee;

import za.ac.cput.Domain.Fee.WeekendFee;

public class WeekendFeeFactory
{
    public static WeekendFee getWeekendFee(double price)
    {
        return new WeekendFee.Builder()
                .totalPrice(price)
                .build();
    }

}
