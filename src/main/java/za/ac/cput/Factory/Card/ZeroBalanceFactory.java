package za.ac.cput.Factory.Card;

import za.ac.cput.Domain.Card.ZeroBalance;

public class ZeroBalanceFactory
{
    public static ZeroBalance getZeroBalance(int balance)
    {
        return new ZeroBalance.Builder()
                .balance(balance)
                .build();
    }
}
