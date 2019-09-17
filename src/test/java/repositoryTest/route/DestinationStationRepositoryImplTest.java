package repositoryTest.route;

import org.junit.Test;
import za.ac.cput.domain.route.DestinationStation;
import za.ac.cput.repositories.implimentation.routeRepositoryImpl.DestinationStationRepositoryImpl;

import static org.junit.Assert.*;

public class DestinationStationRepositoryImplTest {

    DestinationStationRepositoryImpl dsri = new DestinationStationRepositoryImpl();
    DestinationStation dS;

    @Test
    public void getAll() {
        dS = new DestinationStation.Builder().stationId("520").stationName("central").build();
        dsri.create(dS);

        assertTrue(dsri.getAll().size() > 0);
    }

    @Test
    public void create() {
        dS = new DestinationStation.Builder().stationId("520").stationName("central").build();
        dsri.create(dS);

        assertFalse(dsri.getAll().isEmpty());
    }

    @Test
    public void update() {
        dS = new DestinationStation.Builder().stationId("520").stationName("central").build();
        dsri.create(dS);
        dS = new DestinationStation.Builder().stationId("320").stationName("park").build();
        dsri.create(dS);

        assertTrue(dsri.getAll().size() > 1);
    }

    @Test
    public void delete() {
        dS = new DestinationStation.Builder().stationId("520").stationName("central").build();
        dsri.create(dS);
        dsri.delete("520");

        assertTrue(dsri.getAll().isEmpty());
    }

    @Test
    public void read() {

        dS = new DestinationStation.Builder().stationId("520").stationName("central").build();
        dsri.create(dS);
        dS = new DestinationStation.Builder().stationId("510").stationName("shopping").build();
        dsri.create(dS);

        assertTrue(dsri.read("510").getStationName().equals("shopping"));
    }
}