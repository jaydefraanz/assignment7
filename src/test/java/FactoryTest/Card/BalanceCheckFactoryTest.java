package FactoryTest.Card;

import org.junit.Test;
import za.ac.cput.Domain.Card.BalanceCheck;
import za.ac.cput.Factory.Card.BalanceCheckFactory;

import static org.junit.Assert.*;

public class BalanceCheckFactoryTest {

    @Test
    public void getBalanceCheck() {
        int currentBalance = 24;

        BalanceCheck bc = BalanceCheckFactory.getBalanceCheck(currentBalance);

        assertEquals(bc.getCurrentBalance(),24);


    }
}