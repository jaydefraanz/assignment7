package RepositoryImplTest.Card;

import org.junit.Test;
import za.ac.cput.Domain.Card.AddCredit;
import za.ac.cput.repositories.implimentation.CardRepositoryImp.AddCreditRepositoryImpl;

import static org.junit.Assert.*;

public class AddCreditRepositoryImplTest {

    AddCreditRepositoryImpl acri = new AddCreditRepositoryImpl();
    AddCredit ac;

    @Test
    public void getAll()
    {
        ac = (AddCredit) new AddCredit.Builder()
                .cardNo("1234").build();
        acri.create(ac);
        ac = (AddCredit) new AddCredit.Builder()
                .cardNo("125")
                .build();
        acri.create(ac);

        assertEquals(acri.getAll().size(), 2);
    }

    @Test
    public void create()
    {
        ac = (AddCredit) new AddCredit.Builder()
                .cardNo("155")
                .build();
        acri.create(ac);

        assertFalse(acri.getAll().isEmpty());
    }

    @Test
    public void update()
    {
        ac = (AddCredit) new AddCredit.Builder()
                .cardNo("155")
                .build();
        acri.create(ac);
        ac = (AddCredit) new AddCredit.Builder()
                .cardNo("156")
                .build();
        acri.create(ac);
        ac = (AddCredit) new AddCredit.Builder()
                .cardNo("155")
                .build();

        ac = acri.update(ac);

        assertEquals(ac.getCardNo(),"155");

    }

    @Test
    public void delete()
    {
        ac = (AddCredit) new AddCredit.Builder()
                .cardNo("105")
                .build();
        acri.delete("105");

        assertTrue(acri.getAll().isEmpty());
    }

    @Test
    public void read()
    {
        ac = (AddCredit) new AddCredit.Builder()
                .cardNo("255")
                .build();

        acri.create(ac);

        System.out.println(acri.read("255"));
    }
}