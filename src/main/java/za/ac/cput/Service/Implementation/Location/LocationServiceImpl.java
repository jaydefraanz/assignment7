package za.ac.cput.Service.Implementation.Location;

import za.ac.cput.Domain.Location.Location;
import za.ac.cput.Service.Location.LocationService;
import za.ac.cput.repositories.LocationRepository.LocationRepository;
import za.ac.cput.repositories.implimentation.LocationRepositoryImpl.LocationRepositoryImpl;

import java.util.Set;

public class LocationServiceImpl implements LocationService {

    private static LocationServiceImpl service = null;
    private LocationRepository repository;

    private LocationServiceImpl(){this.repository = LocationRepositoryImpl.getRepository(); }

    private static LocationServiceImpl getService()
    {
        if (service == null) service = new LocationServiceImpl();
        return service;
    }

    @Override
    public Set<Location> getAll() {
        return repository.getAll();
    }

    @Override
    public Location create(Location location) {
        return repository.create(location);
    }

    @Override
    public Location update(Location location) {
        return repository.update(location);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);
    }

    @Override
    public Location read(String s) {
        return repository.read(s);
    }
}
