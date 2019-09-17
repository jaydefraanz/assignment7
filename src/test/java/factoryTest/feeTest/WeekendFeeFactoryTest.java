package factoryTest.feeTest;

import junit.framework.TestCase;
import org.junit.Test;
import za.ac.cput.domain.fee.WeekendFee;
import za.ac.cput.factory.fee.WeekendFeeFactory;

public class WeekendFeeFactoryTest extends TestCase {

    @Test
    public void getWeekendFee()
    {
        double price = 36;

        WeekendFee wkf = WeekendFeeFactory.getWeekendFee(price);

        assertTrue(wkf.ActualFee() >12);
    }
}