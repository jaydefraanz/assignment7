package za.ac.cput.repositories.cardRepository;

import za.ac.cput.domain.card.BalanceCheck;
import za.ac.cput.repositories.IRepository;

import java.util.Set;

public interface BalanceCheckRepository extends IRepository<BalanceCheck, String>
{
    Set<BalanceCheck> getAll();
}
