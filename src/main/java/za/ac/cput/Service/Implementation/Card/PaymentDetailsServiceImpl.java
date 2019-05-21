package za.ac.cput.Service.Implementation.Card;

import za.ac.cput.Domain.Card.PaymentDetail;
import za.ac.cput.Domain.Driver.DriverDetails;
import za.ac.cput.Service.Card.PaymentDetailService;
import za.ac.cput.repositories.CardRepository.PaymentDetailRepository;
import za.ac.cput.repositories.implimentation.CardRepositoryImp.PaymentDetailRepositoryImpl;

import java.util.Set;

public class PaymentDetailsServiceImpl  implements PaymentDetailService {

    private static PaymentDetailsServiceImpl service = null;
    private PaymentDetailRepository repository;

    private PaymentDetailsServiceImpl(){this.repository = PaymentDetailRepositoryImpl.getRepository(); }

    private static PaymentDetailsServiceImpl getService()
    {
        if(service == null) service = new PaymentDetailsServiceImpl();
        return  service;
    }

    @Override
    public Set<PaymentDetail> getAll() {
        return repository.getAll();
    }

    @Override
    public PaymentDetail create(PaymentDetail paymentDetail) {
        return repository.create(paymentDetail);
    }

    @Override
    public PaymentDetail update(PaymentDetail paymentDetail) {
        return repository.update(paymentDetail);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);
    }

    @Override
    public DriverDetails read(String s) {
        return repository.read(s);
    }
}
