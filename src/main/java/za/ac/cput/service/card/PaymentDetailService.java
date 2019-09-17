package za.ac.cput.service.card;

import za.ac.cput.domain.card.PaymentDetail;
import za.ac.cput.service.IService;

import java.util.Set;

public interface PaymentDetailService extends IService<PaymentDetail, String> {
    Set<PaymentDetail> getAll();
}
