package repositoryTest.driver;

import org.junit.Test;
import za.ac.cput.domain.driver.DriverContact;
import za.ac.cput.repositories.implimentation.driverRepositoryImpl.DriverContactRepositoryImpl;

import static org.junit.Assert.*;

public class DriverContactRepositoryImplTest {

    DriverContactRepositoryImpl ddri = new DriverContactRepositoryImpl();
    DriverContact dc;


    @Test
    public void create()
    {
        dc = new DriverContact.Builder().email("jay@gmail.com").phone("07152147896").builder();
        ddri.create(dc);

        assertTrue(ddri.getAll().size() ==1);
    }

    @Test
    public void update()
    {
        dc = new DriverContact.Builder().email("jay@gmail.com").phone("07152147896").builder();
        ddri.create(dc);
        dc = new DriverContact.Builder().email("jade@gmail.com").phone("07152147896").builder();
        ddri.update(dc);

        assertTrue(ddri.getAll().size()==1);

    }

    @Test
    public void delete()
    {
        dc = new DriverContact.Builder().email("jay@gmail.").phone("07152147896").builder();
        ddri.create(dc);
        ddri.delete("07152147896");

        assertTrue(ddri.getAll().size() == 0);
    }

    @Test
    public void read()
    {
        dc = new DriverContact.Builder().email("jay@gmail.").phone("07152147896").builder();
        ddri.create(dc);

        assertFalse(ddri.read("07152147896").getEmail().isEmpty());
    }
}