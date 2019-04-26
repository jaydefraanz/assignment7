package za.ac.cput.repositories.implimentation.BusRepositoryImp;

import za.ac.cput.Domain.Bus.BusDetails;
import za.ac.cput.repositories.BusRepository.BusDetailsRepository;

import java.util.HashSet;
import java.util.Set;

public class BusDetailRepositoryImpl implements BusDetailsRepository {

    private static BusDetailsRepository repository = null;
    private Set<BusDetails> busDetails;

    private BusDetailRepositoryImpl(){this.busDetails = new HashSet<>(); }

    public static BusDetailsRepository getRepository(){
        if(repository == null) repository = new BusDetailRepositoryImpl();
        return repository;
    }


    @Override
    public Set<BusDetails> getAll() {
        return null;
    }

    @Override
    public BusDetails create(BusDetails busDetails) {
        return null;
    }

    @Override
    public BusDetails update(BusDetails busDetails) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public BusDetails read(String s) {
        return null;
    }
}
