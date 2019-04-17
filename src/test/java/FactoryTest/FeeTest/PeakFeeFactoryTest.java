package FactoryTest.FeeTest;


import org.junit.Test;
import za.ac.cput.Domain.Fee.PeakFee;
import za.ac.cput.Factory.Fee.PeakFeeFactory;

import static org.junit.Assert.assertTrue;

public class PeakFeeFactoryTest {

    @Test
    public void getPeakFee()
    {
       double price = 15;

        PeakFee pF = PeakFeeFactory.getPeakFee(price);

        assertTrue(pF.ActualFee() > 0);
    }
}