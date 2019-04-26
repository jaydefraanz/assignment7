package za.ac.cput.repositories.implimentation.CardRepositoryImp;

import za.ac.cput.Domain.Card.AddCredit;
import za.ac.cput.repositories.CardRepository.AddCreditRepository;

import java.util.HashSet;
import java.util.Set;

public class AddCreditRepositoryImpl implements AddCreditRepository {

    private static AddCreditRepository repository = null;
    private Set<AddCredit> addCredits;

    private AddCreditRepositoryImpl(){this.addCredits = new HashSet<>(); }

    public static AddCreditRepository getRepository(){
        if(repository == null) repository = new AddCreditRepositoryImpl();
        return repository;
    }

    @Override
    public Set<AddCredit> getAll() {
        return null;
    }

    @Override
    public AddCredit create(AddCredit addCredit) {
        return null;
    }

    @Override
    public AddCredit update(AddCredit addCredit) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public AddCredit read(String s) {
        return null;
    }
}
