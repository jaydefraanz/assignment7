package za.ac.cput.Service.Implementation.Bus;

import za.ac.cput.Domain.Bus.BusDetails;
import za.ac.cput.Service.Bus.BusDetailsService;
import za.ac.cput.repositories.BusRepository.BusDetailsRepository;
import za.ac.cput.repositories.implimentation.BusRepositoryImp.BusDetailRepositoryImpl;

import java.util.Set;

public class BusDetailsServiceImpl implements BusDetailsService {

    private static BusDetailsServiceImpl service = null;
    private BusDetailsRepository repository;

    private BusDetailsServiceImpl(){this.repository = BusDetailRepositoryImpl.getRepository(); }

    private static BusDetailsServiceImpl getService()
    {
        if(service == null) service = new BusDetailsServiceImpl();
        return service;
    }

    @Override
    public Set<BusDetails> getAll() {
        return repository.getAll();
    }

    @Override
    public BusDetails create(BusDetails busDetails) {
        return repository.create(busDetails);
    }

    @Override
    public BusDetails update(BusDetails busDetails) {
        return repository.update(busDetails);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);
    }

    @Override
    public BusDetails read(String s) {
        return repository.read(s);
    }
}
