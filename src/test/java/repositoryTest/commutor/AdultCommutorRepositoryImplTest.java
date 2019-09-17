package repositoryTest.commutor;

import org.junit.Test;
import za.ac.cput.domain.commutors.Adult;
import za.ac.cput.repositories.implimentation.commutorsRepositoryImpl.AdultCommutorRepositoryImpl;

import static org.junit.Assert.*;

public class AdultCommutorRepositoryImplTest {

    AdultCommutorRepositoryImpl acri = new AdultCommutorRepositoryImpl();
    Adult adt;

    @Test
    public void getAll()
    {
        adt = (Adult) new Adult.Builder()
                .age(45)
                .cardNo("43")
                .name("Jay")
                .build();
        acri.create(adt);

        assertTrue(acri.getAll().contains(adt));
    }

    @Test
    public void create()
    {
        adt = (Adult) new Adult.Builder()
                .age(45)
                .cardNo("43")
                .name("Jay")
                .build();
        acri.create(adt);

        assertFalse(acri.getAll().isEmpty());
    }

    @Test
    public void update()
    {
        adt = (Adult) new Adult.Builder()
                .age(45)
                .cardNo("43")
                .name("Jay")
                .build();
        acri.create(adt);
        adt = (Adult) new Adult.Builder()
                .age(45)
                .cardNo("43")
                .name("jade")
                .build();
        acri.update(adt);

        assertTrue(acri.read("43").getName().equals("jade"));
    }

    @Test
    public void delete()
    {
        adt = (Adult) new Adult.Builder()
                .age(45)
                .cardNo("46")
                .name("Jay")
                .build();
        acri.create(adt);
        acri.delete("46");

        assertTrue(acri.getAll().isEmpty());
    }

    @Test
    public void read()
    {
        adt = (Adult) new Adult.Builder()
                .age(45)
                .cardNo("46")
                .name("Jay")
                .build();
        acri.create(adt);

        assertTrue(acri.read("46").getName().equals("Jay"));
    }
}