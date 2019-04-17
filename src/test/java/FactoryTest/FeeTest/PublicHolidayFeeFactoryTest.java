package FactoryTest.FeeTest;

import org.junit.Test;
import za.ac.cput.Domain.Fee.PublicHolidayFee;
import za.ac.cput.Factory.Fee.PublicHolidayFeeFactory;

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