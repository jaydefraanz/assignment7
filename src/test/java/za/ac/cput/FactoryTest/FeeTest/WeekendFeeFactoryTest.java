package za.ac.cput.FactoryTest.FeeTest;

import junit.framework.TestCase;
import org.junit.Test;
import za.ac.cput.Domain.Fee.WeekendFee;
import za.ac.cput.FactoryTest.Fee.WeekendFeeFactory;

public class WeekendFeeFactoryTest extends TestCase {

    @Test
    public void getWeekendFee()
    {
        double price = 36;

        WeekendFee wkf = WeekendFeeFactory.getWeekendFee(price);

        assertTrue(wkf.ActualFee() >12);
    }
}