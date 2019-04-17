package FactoryTest.Card;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.Domain.Card.PositiveBalance;
import za.ac.cput.Factory.Card.PositiveBalanceFactory;

import static org.junit.Assert.*;

public class PositiveBalanceFactoryTest {

    @Test
    public void getPositiveBalance() {
        int balance = 125;

        PositiveBalance pb = PositiveBalanceFactory.getPositiveBalance(balance);

        Assert.assertEquals(125,pb.getBalance());
    }
}