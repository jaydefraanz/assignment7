package factoryTest.feeTest;

import org.junit.Test;
import za.ac.cput.domain.fee.OffPeakFee;
import za.ac.cput.factory.fee.OffPeakFactory;

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