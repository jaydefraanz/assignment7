package FactoryTest.Card;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.Domain.Card.ZeroBalance;
import za.ac.cput.Factory.Card.ZeroBalanceFactory;

public class ZeroBalanceFactoryTest {

    @Test
    public void getZeroBalance() {
        int balance = -80;

        ZeroBalance zb = ZeroBalanceFactory.getZeroBalance(balance);

        Assert.assertNotNull(zb.getBalance());
    }
}