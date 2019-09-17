package factoryTest.card;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.domain.card.PaymentDetail;
import za.ac.cput.factory.card.PaymentDetailFactory;

public class PaymentDetailFactoryTest {

    @Test
    public void getPaymentDetail() {
        String date = "01/04/2019";

        PaymentDetail pmd = PaymentDetailFactory.getPaymentDetail(date);

        Assert.assertNotNull(pmd.getDate());
    }
}