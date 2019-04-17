package FactoryTest.Card;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.Domain.Card.PaymentDetail;
import za.ac.cput.Factory.Card.PaymentDetailFactory;

import static org.junit.Assert.*;

public class PaymentDetailFactoryTest {

    @Test
    public void getPaymentDetail() {
        String date = "01/04/2019";

        PaymentDetail pmd = PaymentDetailFactory.getPaymentDetail(date);

        Assert.assertNotNull(pmd.getDate());
    }
}