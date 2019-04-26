package za.ac.cput.Domain.Card;

import java.util.Objects;

public class Card
{
    String cardNo;

    public Card() {
    }

    public Card(Builder builder) {
        this.cardNo = builder.cardNo;
    }

    public String getCardNo() {
        return cardNo;
    }

    public static class Builder {
        String cardNo;

        public Builder cardNo(String cardNo) {
            this.cardNo = cardNo;
            return this;
        }

        public Card build()
        {
            return new Card(this);
        }
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardNo='" + cardNo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return cardNo.equals(card.cardNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardNo);
    }
}
