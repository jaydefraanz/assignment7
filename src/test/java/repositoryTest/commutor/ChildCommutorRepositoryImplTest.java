package repositoryTest.commutor;

import org.junit.Test;
import za.ac.cput.domain.commutors.Child;
import za.ac.cput.repositories.implimentation.commutorsRepositoryImpl.ChildCommutorRepositoryImpl;

import static org.junit.Assert.*;

public class ChildCommutorRepositoryImplTest {

    ChildCommutorRepositoryImpl ccri = new ChildCommutorRepositoryImpl();
    Child chld;

    @Test
    public void getAll()
    {
        chld = (Child) new Child.Builder()
                .age(05)
                .cardNo("345")
                .name("default")
                .build();
        ccri.create(chld);
        chld = (Child) new Child.Builder()
                .age(05)
                .cardNo("345")
                .name("default")
                .build();
        ccri.create(chld);

        assertTrue(ccri.getAll().size() == 2);
    }

    @Test
    public void create()
    {
        chld = (Child) new Child.Builder()
                .age(05)
                .cardNo("345")
                .name("default")
                .build();
        ccri.create(chld);

        assertTrue(ccri.read("345").getName().equals("default"));
    }

    @Test
    public void update()
    {
        chld = (Child) new Child.Builder()
                .age(05)
                .cardNo("345")
                .name("default")
                .build();
        ccri.create(chld);
        chld = (Child) new Child.Builder()
                .age(05)
                .cardNo("345")
                .name("jay")
                .build();
        ccri.update(chld);

        assertTrue(ccri.read("345").getName().equals("jay"));
    }

    @Test
    public void delete()
    {
        chld = (Child) new Child.Builder()
                .age(05)
                .cardNo("345")
                .name("default")
                .build();
        ccri.create(chld);
        chld = (Child) new Child.Builder()
                .age(05)
                .cardNo("347")
                .name("default")
                .build();
        ccri.create(chld);
        ccri.delete("345'");

        assertTrue(ccri.getAll().size() == 1);
    }

    @Test
    public void read()
    {
        chld = (Child) new Child.Builder()
                .age(05)
                .cardNo("345")
                .name("default")
                .build();
        ccri.create(chld);

        assertTrue(ccri.read("456").getName().isEmpty());
    }
}