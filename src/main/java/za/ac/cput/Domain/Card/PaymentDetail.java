package za.ac.cput.Domain.Card;

public class PaymentDetail extends AddCredit
{
    String date;

    public PaymentDetail() {
    }

    public PaymentDetail(Builder builder) {
        super(builder);
        date = builder.date;
    }

    public String getDate() {
        return date;
    }

    public static class Builder extends AddCredit.Builder {
        String date;

        public Builder date(String date) {
            this.date = date;
            return this;
        }

        public PaymentDetail build()
        {
            return new PaymentDetail(this);
        }
    }

    @Override
    public String toString() {
        return "PaymentDetail{} " + super.toString();
    }
}
