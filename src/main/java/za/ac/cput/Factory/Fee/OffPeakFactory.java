package za.ac.cput.Factory.Fee;

import za.ac.cput.Domain.Fee.OffPeakFee;

public class OffPeakFactory
{

    public static OffPeakFee getOffPeakFee(double price)
    {
        return new OffPeakFee.Builder()
                .totaPrice(price)
                .build();
    }
}
