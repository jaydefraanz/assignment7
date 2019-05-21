package za.ac.cput.Service.Implementation.Card;

import za.ac.cput.Domain.Card.BalanceCheck;
import za.ac.cput.Domain.Driver.DriverDetails;
import za.ac.cput.Service.Card.BalanceCheckService;
import za.ac.cput.repositories.CardRepository.BalanceCheckRepository;
import za.ac.cput.repositories.implimentation.CardRepositoryImp.BalanceCheckRepositoryImpl;

import java.util.Set;

public class BalanceCheckServiceImpl implements BalanceCheckService {

    private static BalanceCheckServiceImpl service = null;
    private BalanceCheckRepository repository;

    private BalanceCheckServiceImpl(){this.repository = BalanceCheckRepositoryImpl.getRepository();}

    private static BalanceCheckServiceImpl getService()
    {
        if(service == null) service = new BalanceCheckServiceImpl();
        return service;
    }

    @Override
    public Set<BalanceCheck> getAll() {
        return repository.getAll();
    }

    @Override
    public BalanceCheck create(BalanceCheck balanceCheck) {
        return repository.create(balanceCheck);
    }

    @Override
    public BalanceCheck update(BalanceCheck balanceCheck) {
        return repository.update(balanceCheck);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);
    }

    @Override
    public DriverDetails read(String s) {
        return repository.read(s);
    }
}
