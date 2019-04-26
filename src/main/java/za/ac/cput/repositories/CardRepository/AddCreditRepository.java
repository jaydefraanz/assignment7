package za.ac.cput.repositories.CardRepository;

import za.ac.cput.Domain.Card.AddCredit;
import za.ac.cput.repositories.IRepository;

import java.util.Set;

public interface AddCreditRepository extends IRepository<AddCredit, String>
{
    Set<AddCredit> getAll();
}
