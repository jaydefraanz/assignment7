package za.ac.cput.factory.card;

import za.ac.cput.domain.card.PositiveBalance;

public class PositiveBalanceFactory {

    public static PositiveBalance getPositiveBalance(int balance)
    {
        return new PositiveBalance.Builder()
                .balance(balance)
                .build();
    }
}
