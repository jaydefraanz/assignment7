package za.ac.cput.Domain.Card;
//check if the balance in this class is an instance of PositiveBalance or ZeroBalance
public class BalanceCheck extends Card
{

    int currentBalance;

    public BalanceCheck() {
    }

    public BalanceCheck(Builder builder) {
        super(builder);
        this.currentBalance = builder.currentBalance;
    }

    public int getCurrentBalance() {
        return currentBalance;
    }

    public static class Builder extends Card.Builder {
        int currentBalance;

        public Builder currentBalance(int currentBalance) {
            this.currentBalance = currentBalance;
            return this;
        }

        public BalanceCheck build()
        {
            return new BalanceCheck(this);
        }
    }

    @Override
    public String toString() {
        return "BalanceCheck{" +
                "currentBalance=" + currentBalance +
                ", cardNo='" + cardNo + '\'' +
                '}';
    }
}
