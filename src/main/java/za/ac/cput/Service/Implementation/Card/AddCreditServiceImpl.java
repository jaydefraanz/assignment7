package za.ac.cput.Service.Implementation.Card;

import za.ac.cput.Domain.Card.AddCredit;
import za.ac.cput.Service.Card.AddCreditService;
import za.ac.cput.repositories.CardRepository.AddCreditRepository;
import za.ac.cput.repositories.implimentation.CardRepositoryImp.AddCreditRepositoryImpl;

import java.util.Set;

public class AddCreditServiceImpl implements AddCreditService {

    private static AddCreditServiceImpl service = null;
    private AddCreditRepository repository;

    private AddCreditServiceImpl(){this.repository = AddCreditRepositoryImpl.getRepository();}

    private static AddCreditServiceImpl getService()
    {
        if(service == null) service = new AddCreditServiceImpl();
        return service;
    }

    @Override
    public Set<AddCredit> getAll() {
        return repository.getAll();
    }

    @Override
    public AddCredit create(AddCredit addCredit) {
        return repository.create(addCredit);
    }

    @Override
    public AddCredit update(AddCredit addCredit) {
        return repository.update(addCredit);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);
    }

    @Override
    public AddCredit read(String s) {
        return repository.read(s);
    }
}
