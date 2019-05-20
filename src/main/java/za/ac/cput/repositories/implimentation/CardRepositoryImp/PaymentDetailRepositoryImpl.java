package za.ac.cput.repositories.implimentation.CardRepositoryImp;

import za.ac.cput.Domain.Card.PaymentDetail;
import za.ac.cput.repositories.CardRepository.PaymentDetailRepository;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PaymentDetailRepositoryImpl  implements PaymentDetailRepository {

    private static PaymentDetailRepository repository = null;
    private Set<PaymentDetail> paymentDetails;

    public PaymentDetailRepositoryImpl(){this.paymentDetails = new HashSet<>();}

    public static PaymentDetailRepository getRepository()
    {
        if(repository == null) repository = new PaymentDetailRepositoryImpl();
        return repository;
    }


    @Override
    public Set<PaymentDetail> getAll() {
        return paymentDetails;
    }

    @Override
    public PaymentDetail create(PaymentDetail paymentDetail)
    {
        this.paymentDetails.add(paymentDetail);
        return paymentDetail;
    }

    @Override
    public PaymentDetail update(PaymentDetail paymentDetail)
    {
        Iterator<PaymentDetail> it = this.paymentDetails.iterator();

        while(it.hasNext())
        {
            if(this.paymentDetails.contains(paymentDetail))
            {
                this.paymentDetails.remove(paymentDetail);
                this.paymentDetails.add(paymentDetail);
                break;
            }
            else
            {
                this.paymentDetails.add(paymentDetail);
            }
            it.next();
        }
        return paymentDetail;
    }

    @Override
    public void delete(String s)
    {
        for (PaymentDetail pmDtail: paymentDetails)
        {
            if(pmDtail.getCardNo() == s)
            {
                paymentDetails.remove(pmDtail);
            }
        }
    }

    @Override
    public PaymentDetail read(String s)
    {
        PaymentDetail pmdt = new PaymentDetail.Builder().build();

        for (PaymentDetail pmDtail: paymentDetails)
        {
            if(pmDtail.getCardNo() == s)
            {
                pmdt = pmDtail;
            }
        }

        return pmdt;
    }
}
