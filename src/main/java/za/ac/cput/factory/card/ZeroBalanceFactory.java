package za.ac.cput.factory.card;

import za.ac.cput.domain.card.ZeroBalance;

public class ZeroBalanceFactory
{
    public static ZeroBalance getZeroBalance(int balance)
    {
        return new ZeroBalance.Builder()
                .balance(balance)
                .build();
    }
}
