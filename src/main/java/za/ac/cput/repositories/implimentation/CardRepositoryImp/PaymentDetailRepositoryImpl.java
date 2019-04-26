package za.ac.cput.repositories.implimentation.CardRepositoryImp;

import za.ac.cput.Domain.Card.PaymentDetail;
import za.ac.cput.repositories.CardRepository.PaymentDetailRepository;

import java.util.HashSet;
import java.util.Set;

public class PaymentDetailRepositoryImpl  implements PaymentDetailRepository {

    private static PaymentDetailRepository repository = null;
    private Set<PaymentDetail> paymentDetails;

    private PaymentDetailRepositoryImpl(){this.paymentDetails = new HashSet<>();}

    public static PaymentDetailRepository getRepository()
    {
        if(repository == null) repository = new PaymentDetailRepositoryImpl();
        return repository;
    }


    @Override
    public Set<PaymentDetail> getAll() {
        return null;
    }

    @Override
    public PaymentDetail create(PaymentDetail paymentDetail) {
        return null;
    }

    @Override
    public PaymentDetail update(PaymentDetail paymentDetail) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public PaymentDetail read(String s) {
        return null;
    }
}
