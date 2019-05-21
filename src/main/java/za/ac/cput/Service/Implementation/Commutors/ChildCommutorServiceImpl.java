package za.ac.cput.Service.Implementation.Commutors;

import za.ac.cput.Domain.Commutors.Child;
import za.ac.cput.Domain.Driver.DriverDetails;
import za.ac.cput.Service.Commutors.ChildCommutorService;
import za.ac.cput.repositories.CommutorsRepository.ChildCommutorRepository;
import za.ac.cput.repositories.implimentation.CommutorsRepositoryImpl.ChildCommutorRepositoryImpl;

import java.util.Set;

public class ChildCommutorServiceImpl implements ChildCommutorService {

    private static ChildCommutorServiceImpl service = null;
    private ChildCommutorRepository repository;

    private ChildCommutorServiceImpl(){this.repository = ChildCommutorRepositoryImpl.getRepository(); }

    private static ChildCommutorServiceImpl getService()
    {
        if(service == null) service = new ChildCommutorServiceImpl();
        return  service;
    }

    @Override
    public Set<Child> getAll() {
        return repository.getAll();
    }

    @Override
    public Child create(Child child) {
        return repository.create(child);
    }

    @Override
    public Child update(Child child) {
        return repository.update(child);
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
