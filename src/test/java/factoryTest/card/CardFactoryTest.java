package factoryTest.card;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.domain.card.Card;
import za.ac.cput.factory.card.CardFactory;

public class CardFactoryTest {

    @Test
    public void getCard() {
        String cardNo = "5012";

        Card cd = CardFactory.getCard(cardNo);

        Assert.assertNotNull(cd.getCardNo());
    }
}