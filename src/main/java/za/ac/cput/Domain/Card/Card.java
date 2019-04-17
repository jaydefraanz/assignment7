package za.ac.cput.Domain.Card;

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
}
