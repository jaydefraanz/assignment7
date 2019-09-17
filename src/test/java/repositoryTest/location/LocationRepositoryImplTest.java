package repositoryTest.location;

import org.junit.Test;
import za.ac.cput.domain.location.Location;
import za.ac.cput.repositories.implimentation.locationRepositoryImpl.LocationRepositoryImpl;

import static org.junit.Assert.*;

public class LocationRepositoryImplTest {

    LocationRepositoryImpl lri = new LocationRepositoryImpl();
    Location loc;

    @Test
    public void getAll() {
        loc = new Location.Builder().locationName("City").locationNo("20").build();
        lri.create(loc);

        assertTrue(lri.getAll().size() > 0);
    }

    @Test
    public void create() {
        loc = new Location.Builder().locationName("City").locationNo("20").build();
        lri.create(loc);

        assertFalse(lri.getAll().isEmpty());
    }

    @Test
    public void update() {
        loc = new Location.Builder().locationName("City").locationNo("20").build();
        lri.create(loc);
        loc = new Location.Builder().locationName("DownTown").locationNo("20").build();
        lri.update(loc);

        assertTrue(lri.read("20").getLocationName().equals("DownTown"));
    }

    @Test
    public void delete() {
        loc = new Location.Builder().locationName("City").locationNo("20").build();
        lri.create(loc);
        lri.delete("20");

        assertTrue(lri.getAll().size() == 0);
    }

    @Test
    public void read() {
        loc = new Location.Builder().locationName("City").locationNo("20").build();
        lri.create(loc);

        assertFalse(lri.read("20").getLocationName().isEmpty());
    }
}