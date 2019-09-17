package repositoryTest.route;

import org.junit.Test;
import za.ac.cput.domain.route.Route;
import za.ac.cput.repositories.implimentation.routeRepositoryImpl.RouteRepositoryImpl;

import static org.junit.Assert.*;

public class RouteRepositoryImplTest {

    RouteRepositoryImpl rri = new RouteRepositoryImpl();
    Route route;

    @Test
    public void getAll() {
        route = new Route.Builder().routeName("peninsula").routeNo("412").locationId("520").build();
        rri.create(route);

        assertTrue(rri.getAll().size() > 0);
    }

    @Test
    public void create() {
        route = new Route.Builder().routeName("peninsula").routeNo("412").locationId("520").build();
        rri.create(route);

        assertFalse(rri.getAll().isEmpty());
    }

    @Test
    public void update() {
        route = new Route.Builder().routeName("peninsula").routeNo("412").locationId("520").build();
        rri.create(route);
        route = new Route.Builder().routeName("Town").routeNo("412").locationId("520").build();
        rri.create(route);

        assertFalse(rri.getAll().isEmpty());
    }

    @Test
    public void delete() {
        route = new Route.Builder().routeName("peninsula").routeNo("412").locationId("520").build();
        rri.create(route);
        rri.delete("412");

        assertTrue(rri.getAll().isEmpty());
    }

    @Test
    public void read() {
        route = new Route.Builder().routeName("peninsula").routeNo("412").locationId("520").build();
        rri.create(route);

        assertFalse(rri.read("412").getRouteName().isEmpty());
    }
}