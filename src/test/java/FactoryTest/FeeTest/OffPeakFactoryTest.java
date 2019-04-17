package FactoryTest.FeeTest;

import org.junit.Test;
import za.ac.cput.Domain.Fee.OffPeakFee;
import za.ac.cput.Factory.Fee.OffPeakFactory;

import static org.junit.Assert.assertTrue;

public class OffPeakFactoryTest {

    @Test
    public void getOffPeakFee()
    {
        double price = 25;

        OffPeakFee off = OffPeakFactory.getOffPeakFee(price);

        assertTrue(off.ActualFee() > 20);

    }
}