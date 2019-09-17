package za.ac.cput.domain.card;

public class AddCredit extends Card
{
    int amount;

    public AddCredit() {
    }

    public AddCredit(Builder builder) {
        super(builder);
        amount = builder.amount;
    }

    public int getAmount() {
        return amount;
    }

    public static class Builder extends Card.Builder{
        int amount;

        public Builder amount(int amount) {
            this.amount = amount;
            return this;
        }

        public AddCredit build()
        {
            return new AddCredit(this);
        }
    }

    @Override
    public String toString() {
        return "AddCredit{" +
                "amount=" + amount +
                ", cardNo='" + cardNo + '\'' +
                '}';
    }


}
