package za.ac.cput.factory.card;

import za.ac.cput.domain.card.AddCredit;

public class AddCreditFactory {
    public static AddCredit getAddCredit(int amount)
    {
        return new AddCredit.Builder()
                .amount(amount)
                .build();
    }
}
