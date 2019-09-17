package za.ac.cput.factory.fee;

import za.ac.cput.domain.fee.PeakFee;

public class PeakFeeFactory
{
    public static PeakFee getPeakFee(double price)
    {
        return new PeakFee.Builder()
                .totalPrice(price)
                .build();
    }
}
