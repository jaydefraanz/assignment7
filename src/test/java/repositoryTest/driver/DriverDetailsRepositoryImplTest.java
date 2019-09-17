package repositoryTest.driver;

import org.junit.Test;
import za.ac.cput.domain.driver.DriverDetails;
import za.ac.cput.repositories.implimentation.driverRepositoryImpl.DriverDetailsRepositoryImpl;

import static org.junit.Assert.*;

public class DriverDetailsRepositoryImplTest {

    DriverDetailsRepositoryImpl driverDetailrep = new DriverDetailsRepositoryImpl();
    DriverDetails details;

    @Test
    public void getAll() {
        details = new DriverDetails.Builder().idNo("9752145208522").name("Jay").surname("New").build();
        driverDetailrep.create(details);

        assertTrue(driverDetailrep.getAll().size() > 0);
    }

    @Test
    public void create() {
        details = new DriverDetails.Builder().idNo("9752145208522").name("Jay").surname("New").build();
        driverDetailrep.create(details);

        assertFalse(driverDetailrep.getAll().isEmpty());
    }

    @Test
    public void update() {
        details = new DriverDetails.Builder().idNo("9752145208522").name("Jay").surname("New").build();
        driverDetailrep.create(details);
        details = new DriverDetails.Builder().idNo("9752145208522").name("Brand").surname("New").build();
        driverDetailrep.update(details);

        assertTrue(driverDetailrep.read("9752145208522").getName().equals("Brand"));
    }

    @Test
    public void delete() {
        details = new DriverDetails.Builder().idNo("9752145208522").name("Jay").surname("New").build();
        driverDetailrep.create(details);
        driverDetailrep.delete("9752145208522");

        assertTrue(driverDetailrep.getAll().isEmpty());
    }

    @Test
    public void read() {
        details = new DriverDetails.Builder().idNo("985145208522").name("Jay").surname("New").build();
        driverDetailrep.create(details);
        details = new DriverDetails.Builder().idNo("9752145208522").name("Brand").surname("New").build();
        driverDetailrep.create(details);

        assertTrue(driverDetailrep.read("9752145208522").getName().equals("Brand"));
    }
}