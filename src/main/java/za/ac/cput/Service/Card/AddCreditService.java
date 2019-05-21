package za.ac.cput.Service.Card;

import za.ac.cput.Domain.Card.AddCredit;
import za.ac.cput.Service.IService;

import java.util.Set;

public interface AddCreditService  extends IService<AddCredit, String> {
    Set<AddCredit> getAll();
}
