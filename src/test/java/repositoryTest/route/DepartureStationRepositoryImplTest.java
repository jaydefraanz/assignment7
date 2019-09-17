package repositoryTest.route;

import org.junit.Test;
import za.ac.cput.domain.route.DepartureStation;
import za.ac.cput.repositories.implimentation.routeRepositoryImpl.DepartureStationRepositoryImpl;

import static org.junit.Assert.*;

public class DepartureStationRepositoryImplTest {

    DepartureStationRepositoryImpl dept = new DepartureStationRepositoryImpl();
    DepartureStation deptStation;

    @Test
    public void getAll() {
        deptStation = new DepartureStation.Builder().stationId("85").stationName("Strand").build();
        dept.create(deptStation);

        assertTrue(dept.getAll().size() > 0);
    }

    @Test
    public void create() {
        deptStation = new DepartureStation.Builder().stationId("85").stationName("Strand").build();
        dept.create(deptStation);

        assertFalse(dept.getAll().isEmpty());
    }

    @Test
    public void update() {

        deptStation = new DepartureStation.Builder().stationId("85").stationName("Strand").build();
        dept.create(deptStation);
        deptStation = new DepartureStation.Builder().stationId("88").stationName("Beach").build();
        dept.create(deptStation);

        assertTrue(dept.read("88").getStationName().equals("Beach"));
    }

    @Test
    public void delete() {
        deptStation = new DepartureStation.Builder().stationId("85").stationName("Strand").build();
        dept.create(deptStation);
        dept.delete("85");

        assertTrue(dept.getAll().isEmpty());
    }

    @Test
    public void read() {
        deptStation = new DepartureStation.Builder().stationId("85").stationName("Strand").build();
        dept.create(deptStation);

        assertFalse(dept.read("85").getStationName().isEmpty());
    }
}