package za.ac.cput.factory.card;

import za.ac.cput.domain.card.BalanceCheck;

public class BalanceCheckFactory
{
    public static BalanceCheck getBalanceCheck(int currentBalance)
    {
        return (BalanceCheck) new BalanceCheck.Builder()
                .currentBalance(currentBalance)
                .build();
    }
}
