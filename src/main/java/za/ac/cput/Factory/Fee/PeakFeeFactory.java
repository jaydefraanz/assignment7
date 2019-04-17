package za.ac.cput.Factory.Fee;

import za.ac.cput.Domain.Fee.PeakFee;

public class PeakFeeFactory
{
    public static PeakFee getPeakFee(double price)
    {
        return new PeakFee.Builder()
                .totalPrice(price)
                .build();
    }
}
