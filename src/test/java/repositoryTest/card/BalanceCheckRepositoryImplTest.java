package repositoryTest.card;

import org.junit.Test;
import za.ac.cput.domain.card.BalanceCheck;
import za.ac.cput.repositories.implimentation.cardRepositoryImp.BalanceCheckRepositoryImpl;

import static org.junit.Assert.*;

public class BalanceCheckRepositoryImplTest {

    BalanceCheckRepositoryImpl bcri = new BalanceCheckRepositoryImpl();
    BalanceCheck balance;

    @Test
    public void getAll()
    {
        balance = (BalanceCheck) new BalanceCheck.Builder().cardNo("201").build();
        bcri.create(balance);

        assertFalse(bcri.getAll().isEmpty());
    }

    @Test
    public void create() {
        balance = (BalanceCheck) new BalanceCheck.Builder().cardNo("221").build();
        bcri.create(balance);

        assertFalse(bcri.getAll().isEmpty());
    }

    @Test
    public void update()
    {
        balance = (BalanceCheck) new BalanceCheck.Builder().currentBalance(25).cardNo("205").build();
        bcri.create(balance);
        balance = (BalanceCheck) new BalanceCheck.Builder().currentBalance(50).cardNo("205").build();

        balance = bcri.update(balance);
        System.out.println(bcri.read("205"));
        assertTrue(balance.getCurrentBalance() == 50);
    }

    @Test
    public void delete() {
        balance = (BalanceCheck) new BalanceCheck.Builder().currentBalance(25).cardNo("205").build();
        bcri.create(balance);
        bcri.delete("205");

        assertTrue(bcri.getAll().size() == 0);
    }

    @Test
    public void read()
    {
        balance = (BalanceCheck) new BalanceCheck.Builder().currentBalance(25).cardNo("205").build();
        bcri.create(balance);

        System.out.println(bcri.read("205"));

        assertTrue(bcri.getAll().size() == 1);
    }
}