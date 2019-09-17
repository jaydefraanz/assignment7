package za.ac.cput.repositories.implimentation.commutorsRepositoryImpl;

import za.ac.cput.domain.commutors.Child;
import za.ac.cput.repositories.commutorsRepository.ChildCommutorRepository;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ChildCommutorRepositoryImpl implements ChildCommutorRepository {

    private static ChildCommutorRepository repository = null;
    private Set<Child> children;

    public ChildCommutorRepositoryImpl(){
        this.children = new HashSet<>();
    }

    //check if there is an repository otherwise one is created
    public static ChildCommutorRepository getRepository()
    {
        if(repository == null) repository = new ChildCommutorRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Child> getAll() {
        return children;
    }

    @Override
    public Child create(Child child) {
        this.children.add(child);
        return child;
    }

    @Override
    public Child update(Child child) {
        Iterator<Child> it = this.children.iterator();

        while(it.hasNext())
        {
            if(this.children.contains(child))
            {
                this.children.remove(child);
                this.children.add(child);
                break;
            }
            else
            {
                this.children.add(child);
            }
            it.next();
        }
        return child;
    }

    @Override
    public void delete(String s)
    {
        for (Child child: children)
        {
            if(child.getCardNo() == s)
            {
                children.remove(child);
            }
        }
    }

    @Override
    public Child read(String s)
    {
        Child chld = new Child.Builder().build();
        for (Child child: children)
        {
            if(child.getCardNo() == s)
            {
                chld = child;
            }
        }


        return chld;
    }

}