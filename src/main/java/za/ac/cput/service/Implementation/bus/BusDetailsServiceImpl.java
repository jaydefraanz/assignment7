package za.ac.cput.service.Implementation.bus;

import org.springframework.stereotype.Service;
import za.ac.cput.domain.bus.BusDetails;
import za.ac.cput.service.bus.BusDetailsService;
import za.ac.cput.repositories.busRepository.BusDetailsRepository;
import za.ac.cput.repositories.implimentation.busRepositoryImp.BusDetailRepositoryImpl;

import java.util.Set;

@Service("BusDetailsServiceImpl")
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
