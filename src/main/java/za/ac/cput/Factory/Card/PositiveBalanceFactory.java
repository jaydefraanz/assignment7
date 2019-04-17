package za.ac.cput.Factory.Card;

import za.ac.cput.Domain.Card.PositiveBalance;

public class PositiveBalanceFactory {

    public static PositiveBalance getPositiveBalance(int balance)
    {
        return new PositiveBalance.Builder()
                .balance(balance)
                .build();
    }
}
