package RepositoryImplTest.Driver;

import org.junit.Test;
import za.ac.cput.Domain.Driver.AssignedBus;
import za.ac.cput.repositories.implimentation.DriverRepositoryImpl.AssignedBusRepositoryImpl;

import static org.junit.Assert.*;

public class AssignedBusRepositoryImplTest {

    AssignedBusRepositoryImpl abri = new AssignedBusRepositoryImpl();
    AssignedBus aB;

    @Test
    public void getAll() {
        aB = new AssignedBus.Builder().busNo("85").busName("City").route("Peninsula").build();
        abri.create(aB);
        aB = new AssignedBus.Builder().busNo("75").busName("City").route("Peninsula").build();
        abri.create(aB);

        assertTrue(abri.getAll().size() ==2);
    }

    @Test
    public void create()
    {
        aB = new AssignedBus.Builder().busNo("85").busName("City").route("Peninsula").build();
        abri.create(aB);

        assertFalse(abri.getAll().isEmpty());
    }

    @Test
    public void update()
    {
        aB = new AssignedBus.Builder().busNo("85").busName("City").route("Peninsula").build();
        abri.create(aB);
        aB = new AssignedBus.Builder().busNo("85").busName("Uptown").route("Peninsula").build();
        abri.update(aB);

        assertTrue(abri.read("85").getBusName().equals("Uptown"));
    }

    @Test
    public void delete() {
        aB = new AssignedBus.Builder().busNo("85").busName("City").route("Peninsula").build();
        abri.create(aB);
        abri.delete("85");

        assertTrue(abri.getAll().isEmpty());
    }

    @Test
    public void read() {
        aB = new AssignedBus.Builder().busNo("85").busName("City").route("Peninsula").build();
        abri.create(aB);

        assertTrue(abri.read("85").getBusName().equals("City"));
    }
}