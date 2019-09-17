package factoryTest.feeTest;

import org.junit.Test;
import za.ac.cput.domain.fee.PublicHolidayFee;
import za.ac.cput.factory.fee.PublicHolidayFeeFactory;

import static org.junit.Assert.assertTrue;

public class PublicHolidayFeeFactoryTest {

    @Test
    public void getPublicHolidayFee()
    {
        double price = -20;

        PublicHolidayFee phf  = PublicHolidayFeeFactory.getPublicHolidayFee(price);

        assertTrue(phf.ActualFee() > 0);
    }
}