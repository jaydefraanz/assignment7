package za.ac.cput.service.card;

import za.ac.cput.domain.card.AddCredit;
import za.ac.cput.service.IService;

import java.util.Set;

public interface AddCreditService  extends IService<AddCredit, String> {
    Set<AddCredit> getAll();
}
