package za.ac.cput.repositories.cardRepository;

import za.ac.cput.domain.card.AddCredit;
import za.ac.cput.repositories.IRepository;

import java.util.Set;

public interface AddCreditRepository extends IRepository<AddCredit, String>
{
    Set<AddCredit> getAll();
}
