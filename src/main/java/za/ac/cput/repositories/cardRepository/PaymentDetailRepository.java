package za.ac.cput.repositories.cardRepository;

import za.ac.cput.domain.card.PaymentDetail;
import za.ac.cput.repositories.IRepository;

import java.util.Set;

public interface PaymentDetailRepository extends IRepository<PaymentDetail,String>
{
    Set<PaymentDetail> getAll();
}
