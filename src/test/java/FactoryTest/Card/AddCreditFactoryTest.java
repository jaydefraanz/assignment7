package FactoryTest.Card;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.Domain.Card.AddCredit;
import za.ac.cput.Factory.Card.AddCreditFactory;

import static org.junit.Assert.*;

public class AddCreditFactoryTest {

    @Test
    public void getAddCredit() {
        int amount = 50;

        AddCredit ac = AddCreditFactory.getAddCredit(amount);

        Assert.assertEquals(50,ac.getAmount());
    }
}