package za.ac.cput.factory.fee;

import za.ac.cput.domain.fee.OffPeakFee;

public class OffPeakFactory
{

    public static OffPeakFee getOffPeakFee(double price)
    {
        return new OffPeakFee.Builder()
                .totaPrice(price)
                .build();
    }
}
