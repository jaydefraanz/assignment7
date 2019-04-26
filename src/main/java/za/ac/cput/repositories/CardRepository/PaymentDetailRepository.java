package za.ac.cput.repositories.CardRepository;

import za.ac.cput.Domain.Card.PaymentDetail;
import za.ac.cput.repositories.IRepository;

import java.util.Set;

public interface PaymentDetailRepository extends IRepository<PaymentDetail,String>
{
    Set<PaymentDetail> getAll();
}
