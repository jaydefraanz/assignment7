package za.ac.cput.repositories.implimentation.cardRepositoryImp;

import za.ac.cput.domain.card.BalanceCheck;
import za.ac.cput.repositories.cardRepository.BalanceCheckRepository;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class BalanceCheckRepositoryImpl implements BalanceCheckRepository {

    private static BalanceCheckRepositoryImpl repository = null;
    private Set<BalanceCheck> balanceChecks;

    public BalanceCheckRepositoryImpl(){this.balanceChecks = new HashSet<>(); }

    public static BalanceCheckRepository getRepository()
    {
        if(repository == null) repository = new BalanceCheckRepositoryImpl();
        return repository;
    }

    @Override
    public Set<BalanceCheck> getAll() {
        return balanceChecks;
    }

    @Override
    public BalanceCheck create(BalanceCheck balanceCheck)
    {
        this.balanceChecks.add(balanceCheck);
        return balanceCheck;
    }

    @Override
    public BalanceCheck update(BalanceCheck balanceCheck)
    {
        Iterator<BalanceCheck> it = this.balanceChecks.iterator();

        while(it.hasNext())
        {
            if(this.balanceChecks.contains(balanceCheck))
            {
                this.balanceChecks.remove(balanceCheck);
                this.balanceChecks.add(balanceCheck);
                break;
            }
            else
            {
                this.balanceChecks.add(balanceCheck);
            }
            it.next();
        }
        return balanceCheck;
    }

    @Override
    public void delete(String s)
    {
        for (BalanceCheck bC: balanceChecks)
        {
            if(bC.getCardNo() == s)
            {
                balanceChecks.remove(bC);
            }
        }

    }

    @Override
    public BalanceCheck read(String s)
    {
        BalanceCheck balCheck = new BalanceCheck.Builder().build();
        for (BalanceCheck bC: balanceChecks)
        {
            if(bC.getCardNo() == s)
            {
                balCheck = bC;
            }
        }
        return balCheck;
    }
}