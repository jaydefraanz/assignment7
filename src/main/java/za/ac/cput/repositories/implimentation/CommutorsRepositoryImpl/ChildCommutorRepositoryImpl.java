package za.ac.cput.repositories.implimentation.CommutorsRepositoryImpl;

import za.ac.cput.Domain.Commutors.Child;
import za.ac.cput.repositories.CommutorsRepository.ChildCommutorRepository;

import java.util.HashSet;
import java.util.Set;

public class ChildCommutorRepositoryImpl implements ChildCommutorRepository {

    private static ChildCommutorRepository repository = null;
    private Set<Child> children;

    private ChildCommutorRepositoryImpl(){
        this.children = new HashSet<>();
    }

    //check if there is an repository otherwise one is created
    public static ChildCommutorRepository getRepository()
    {
        if(repository == null) repository = new ChildCommutorRepositoryImpl();
        return repository;
    }


    @Override
    public Child create(Child child) {
        //this.children.add(childCommutorRepositoryImpl);
        return null;
    }

    @Override
    public Child update(Child child) {
       // return this.children.stream().filter(Child -> children.getCardNo().equals(children.getCardNo()))
       //         .findAny()
       //         .orElse(null);;

                return null;
    }

    @Override
    public void delete(String s)
    {
        this.children.remove(s);
    }

    @Override
    public Child read(String s) {
        return null;
    }

    @Override
    public Set<Child> getAll() {
        return this.getAll();
    }
}