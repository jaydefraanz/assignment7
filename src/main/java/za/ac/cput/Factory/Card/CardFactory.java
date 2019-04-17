package za.ac.cput.Factory.Card;

import za.ac.cput.Domain.Card.Card;

public class CardFactory
{
    public static Card getCard(String cardNo)
    {
        return new Card.Builder()
                .cardNo(cardNo)
                .build();
    }
}
