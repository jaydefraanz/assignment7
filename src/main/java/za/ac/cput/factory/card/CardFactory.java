package za.ac.cput.factory.card;

import za.ac.cput.domain.card.Card;

public class CardFactory
{
    public static Card getCard(String cardNo)
    {
        return new Card.Builder()
                .cardNo(cardNo)
                .build();
    }
}
