package factoryTest.card;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.domain.card.AddCredit;
import za.ac.cput.factory.card.AddCreditFactory;

public class AddCreditFactoryTest {

    @Test
    public void getAddCredit() {
        int amount = 50;

        AddCredit ac = AddCreditFactory.getAddCredit(amount);

        Assert.assertEquals(50,ac.getAmount());
    }
}