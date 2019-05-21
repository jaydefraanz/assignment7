package za.ac.cput.Service.Card;

import za.ac.cput.Domain.Card.PaymentDetail;
import za.ac.cput.Service.IService;

import java.util.Set;

public interface PaymentDetailService extends IService<PaymentDetail, String> {
    Set<PaymentDetail> getAll();
}
