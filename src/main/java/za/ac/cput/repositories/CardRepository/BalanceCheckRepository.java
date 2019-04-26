package za.ac.cput.repositories.CardRepository;

import za.ac.cput.Domain.Card.BalanceCheck;
import za.ac.cput.repositories.IRepository;

import java.util.Set;

public interface BalanceCheckRepository extends IRepository<BalanceCheck, String>
{
    Set<BalanceCheck> getAll();
}
