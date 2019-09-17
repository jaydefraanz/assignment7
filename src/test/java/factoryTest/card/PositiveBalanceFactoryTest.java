package factoryTest.card;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.domain.card.PositiveBalance;
import za.ac.cput.factory.card.PositiveBalanceFactory;

public class PositiveBalanceFactoryTest {

    @Test
    public void getPositiveBalance() {
        int balance = 125;

        PositiveBalance pb = PositiveBalanceFactory.getPositiveBalance(balance);

        Assert.assertEquals(125,pb.getBalance());
    }
}