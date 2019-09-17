package za.ac.cput.domain.card;

public class PositiveBalance extends BalanceCheck implements  Boarding{

    int balance = 24;

    public PositiveBalance() {
    }

    public PositiveBalance(Builder builder) {
        super(builder);
        balance = builder.balance;
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public boolean canBoard() {
        return true;
    }

    public static class Builder extends BalanceCheck.Builder{
        int balance;

        public PositiveBalance.Builder balance(int balance) {
            this.balance = balance;
            return this;
        }

        public PositiveBalance build()
        {
            return new PositiveBalance(this);
        }
    }

    @Override
    public String toString() {
        return "PositiveBalanceFactory{" +
                "balance=" + balance +
                ", currentBalance=" + currentBalance +
                ", cardNo='" + cardNo + '\'' +
                "} " + super.toString();
    }


}
