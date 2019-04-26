package za.ac.cput.Domain.Card;

import java.util.Objects;
//determine which fee to be paid from this class
//options include offPeakFee, PeakFee, PublicHolidayFee and WeekendFee
public class PaymentDetail extends AddCredit
{
    String date;
    String uniquePaymentNo;

    public PaymentDetail() {
    }

    public PaymentDetail(Builder builder) {
        super(builder);
        date = builder.date;
        uniquePaymentNo = builder.uniquePaymentNo;
    }

    public String getDate() {
        return date;
    }

    public static class Builder extends AddCredit.Builder {
        String date;
        String uniquePaymentNo;

        public Builder date(String date) {
            this.date = date;
            return this;
        }

        public Builder uniquePaymentNo(String uniquePaymentNo)
        {
            this.uniquePaymentNo = uniquePaymentNo;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PaymentDetail that = (PaymentDetail) o;
        return uniquePaymentNo.equals(that.uniquePaymentNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), uniquePaymentNo);
    }
}
