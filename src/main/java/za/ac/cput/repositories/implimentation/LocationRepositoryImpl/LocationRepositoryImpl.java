package za.ac.cput.repositories.implimentation.LocationRepositoryImpl;

import za.ac.cput.Domain.Location.Location;
import za.ac.cput.repositories.LocationRepository.LocationRepository;

import java.util.HashSet;
import java.util.Set;

public class LocationRepositoryImpl implements LocationRepository {

    private static LocationRepository repository = null;
    private Set<Location> locations;

    private LocationRepositoryImpl(){this.locations = new HashSet<>(); }

    public static LocationRepository getRepository()
    {
        if(repository == null) repository = new LocationRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Location> getAll() {
        return null;
    }

    @Override
    public Location create(Location location) {
        return null;
    }

    @Override
    public Location update(Location location) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public Location read(String s) {
        return null;
    }
}
