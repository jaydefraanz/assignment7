package za.ac.cput.Domain.Card;

public class ZeroBalance extends BalanceCheck implements Boarding{

    int balance = -5;

    public ZeroBalance() {
    }

    public ZeroBalance(Builder builder) {
        super(builder);
        balance = builder.balance;
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public boolean canBoard() {
        return false;
    }

    public static class Builder  extends BalanceCheck.Builder{
        int balance;

        public ZeroBalance.Builder balance(int balance) {
            this.balance = balance;
            return this;
        }

        public ZeroBalance build()
        {
            return new ZeroBalance(this);
        }
    }

    @Override
    public String toString() {
        return "ZeroBalance{" +
                "balance=" + balance +
                ", currentBalance=" + currentBalance +
                ", cardNo='" + cardNo + '\'' +
                "} " + super.toString();
    }
}
