package factoryTest.feeTest;


import org.junit.Test;
import za.ac.cput.domain.fee.PeakFee;
import za.ac.cput.factory.fee.PeakFeeFactory;

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