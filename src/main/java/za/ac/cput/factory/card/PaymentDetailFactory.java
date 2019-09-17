package za.ac.cput.factory.card;

import za.ac.cput.domain.card.PaymentDetail;

public class PaymentDetailFactory {
    public static PaymentDetail getPaymentDetail(String date)
    {
        return (PaymentDetail) new PaymentDetail.Builder()
                .date(date)
                .build();
    }
}
