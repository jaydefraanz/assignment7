package factoryTest.card;

import org.junit.Test;
import za.ac.cput.domain.card.BalanceCheck;
import za.ac.cput.factory.card.BalanceCheckFactory;

import static org.junit.Assert.*;

public class BalanceCheckFactoryTest {

    @Test
    public void getBalanceCheck() {
        int currentBalance = 24;

        BalanceCheck bc = BalanceCheckFactory.getBalanceCheck(currentBalance);

        assertEquals(bc.getCurrentBalance(),24);


    }
}