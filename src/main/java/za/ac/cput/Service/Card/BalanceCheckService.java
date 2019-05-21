package za.ac.cput.Service.Card;

import za.ac.cput.Domain.Card.BalanceCheck;
import za.ac.cput.Service.IService;

import java.util.Set;

public interface BalanceCheckService extends IService<BalanceCheck, String> {
    Set<BalanceCheck> getAll();
}
