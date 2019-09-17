package factoryTest.card;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.domain.card.ZeroBalance;
import za.ac.cput.factory.card.ZeroBalanceFactory;

public class ZeroBalanceFactoryTest {

    @Test
    public void getZeroBalance() {
        int balance = -80;

        ZeroBalance zb = ZeroBalanceFactory.getZeroBalance(balance);

        Assert.assertNotNull(zb.getBalance());
    }
}