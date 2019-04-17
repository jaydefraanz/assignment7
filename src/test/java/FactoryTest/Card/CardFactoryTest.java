package FactoryTest.Card;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.Domain.Card.Card;
import za.ac.cput.Factory.Card.CardFactory;

public class CardFactoryTest {

    @Test
    public void getCard() {
        String cardNo = "5012";

        Card cd = CardFactory.getCard(cardNo);

        Assert.assertNotNull(cd.getCardNo());
    }
}