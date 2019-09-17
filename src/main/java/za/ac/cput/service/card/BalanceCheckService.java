package za.ac.cput.service.card;

import za.ac.cput.domain.card.BalanceCheck;
import za.ac.cput.service.IService;

import java.util.Set;

public interface BalanceCheckService extends IService<BalanceCheck, String> {
    Set<BalanceCheck> getAll();
}
