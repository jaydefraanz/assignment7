package za.ac.cput.Factory.Card;

import za.ac.cput.Domain.Card.AddCredit;

public class AddCreditFactory {
    public static AddCredit getAddCredit(int amount)
    {
        return new AddCredit.Builder()
                .amount(amount)
                .build();
    }
}
