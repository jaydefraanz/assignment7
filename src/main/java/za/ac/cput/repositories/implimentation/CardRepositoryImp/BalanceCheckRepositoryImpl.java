package za.ac.cput.repositories.implimentation.CardRepositoryImp;

import za.ac.cput.Domain.Card.BalanceCheck;
import za.ac.cput.repositories.CardRepository.BalanceCheckRepository;

import java.util.HashSet;
import java.util.Set;

public class BalanceCheckRepositoryImpl implements BalanceCheckRepository {

    private static BalanceCheckRepositoryImpl repository = null;
    private Set<BalanceCheck> balanceChecks;

    private BalanceCheckRepositoryImpl(){this.balanceChecks = new HashSet<>(); }

    public static BalanceCheckRepository getRepository()
    {
        if(repository == null) repository = new BalanceCheckRepositoryImpl();
        return repository;
    }

    @Override
    public Set<BalanceCheck> getAll() {
        return null;
    }

    @Override
    public BalanceCheck create(BalanceCheck balanceCheck) {
        return null;
    }

    @Override
    public BalanceCheck update(BalanceCheck balanceCheck) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public BalanceCheck read(String s) {
        return null;
    }
}