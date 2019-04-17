package za.ac.cput.Factory.Card;

import za.ac.cput.Domain.Card.BalanceCheck;

public class BalanceCheckFactory
{
    public static BalanceCheck getBalanceCheck(int currentBalance)
    {
        return new BalanceCheck.Builder()
                .currentBalance(currentBalance)
                .build();
    }
}
