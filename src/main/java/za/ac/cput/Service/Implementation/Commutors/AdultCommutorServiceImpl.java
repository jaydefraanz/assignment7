package za.ac.cput.Service.Implementation.Commutors;

import za.ac.cput.Domain.Commutors.Adult;
import za.ac.cput.Domain.Driver.DriverDetails;
import za.ac.cput.Service.Commutors.AdultCommutorService;
import za.ac.cput.repositories.CommutorsRepository.AdultCommutorRepository;
import za.ac.cput.repositories.implimentation.CommutorsRepositoryImpl.AdultCommutorRepositoryImpl;

import java.util.Set;

public class AdultCommutorServiceImpl implements AdultCommutorService {

    private static AdultCommutorServiceImpl service = null;
    private AdultCommutorRepository repository;

    private AdultCommutorServiceImpl(){this.repository = AdultCommutorRepositoryImpl.getRepository();}

    private static AdultCommutorServiceImpl getService()
    {
        if(service == null) service = new AdultCommutorServiceImpl();
        return service;
    }

    @Override
    public Set<Adult> getAll() {
        return repository.getAll();
    }

    @Override
    public Adult create(Adult adult) {
        return repository.create(adult);
    }

    @Override
    public Adult update(Adult adult) {
        return repository.update(adult);
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
