package za.ac.cput.repositories.implimentation.CommutorsRepositoryImpl;

import za.ac.cput.Domain.Commutors.Adult;
import za.ac.cput.repositories.CommutorsRepository.AdultCommutorRepository;

import java.util.HashSet;
import java.util.Set;

public class AdultCommutorRepositoryImpl implements AdultCommutorRepository {

    private static AdultCommutorRepository repository = null;
    private Set<Adult> adults;

    private AdultCommutorRepositoryImpl(){this.adults = new HashSet<>(); }

    public static AdultCommutorRepository getRepository()
    {
        if (repository == null) repository = new AdultCommutorRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Adult> getAll() {
        return null;
    }

    @Override
    public Adult create(Adult adult) {
        return null;
    }

    @Override
    public Adult update(Adult adult) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public Adult read(String s) {
        return null;
    }
}
