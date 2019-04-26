package za.ac.cput.repositories.implimentation;

import za.ac.cput.Domain.Commutors.Commutor;
import za.ac.cput.repositories.CommutorsRepository.ChildCommutorRepository;

import java.util.HashSet;
import java.util.Set;

public class ChildCommutorRepositoryImpl implements ChildCommutorRepository {

    private static ChildCommutorRepository repository = null;
    private Set<Commutor> commutors;

    private ChildCommutorRepositoryImpl(){
        this.commutors = new HashSet<>();
    }

    public static ChildCommutorRepository getRepository(){
        if(repository == null) repository = new ChildCommutorRepositoryImpl();
        return repository;
    }


    @Override
    public Commutor create(Commutor commutor) {
        this.commutors.add(commutor);
        return null;
    }

    @Override
    public Commutor update(Commutor commutor) {

        return this.commutors.stream().filter(commutors -> commutor.getCardNo().equals(commutors.getCardNo()))
                .findAny()
                .orElse(null);
    }

    @Override
    public void delete(String s)
    {
        this.commutors.remove(s);
    }

    @Override
    public Commutor read(String s) {
        return null;
    }

    @Override
    public Set<Commutor> getAll() {
        return this.commutors;
    }
}
