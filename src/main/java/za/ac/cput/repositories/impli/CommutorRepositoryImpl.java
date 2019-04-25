package za.ac.cput.repositories.impli;

import za.ac.cput.Domain.CommutorPkg.Commutor;
import za.ac.cput.repositories.CommutorRepository;

import java.util.HashSet;
import java.util.Set;

public class CommutorRepositoryImpl implements CommutorRepository {

    private static CommutorRepository repository = null;
    private Set<Commutor> commutors;

    private CommutorRepositoryImpl(){
        this.commutors = new HashSet<>();
    }

    public static CommutorRepository getRepository(){
        if(repository == null) repository = new CommutorRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Commutor> getAll() {
        return null;
    }

    @Override
    public Commutor create(Commutor commutor) {
        return null;
    }

    @Override
    public Commutor update(Commutor commutor) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public Commutor read(String s) {
        return null;
    }
}
