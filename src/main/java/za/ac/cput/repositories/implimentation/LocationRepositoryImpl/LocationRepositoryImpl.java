package za.ac.cput.repositories.implimentation.LocationRepositoryImpl;

import za.ac.cput.Domain.Location.Location;
import za.ac.cput.repositories.LocationRepository.LocationRepository;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LocationRepositoryImpl implements LocationRepository {

    private static LocationRepository repository = null;
    private Set<Location> locations;

    public LocationRepositoryImpl(){this.locations = new HashSet<>(); }

    public static LocationRepository getRepository()
    {
        if(repository == null) repository = new LocationRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Location> getAll() {
        return locations;
    }

    @Override
    public Location create(Location location) {
        this.locations.add(location);
        return location;
    }

    @Override
    public Location update(Location location)
    {
        Iterator<Location> it = this.locations.iterator();

        while(it.hasNext())
        {
            if(this.locations.contains(location))
            {
                this.locations.remove(location);
                this.locations.add(location);
                break;
            }
            else
            {
                this.locations.add(location);
            }
            it.next();
        }
        return location;
    }

    @Override
    public void delete(String s)
    {
        for (Location loc: locations)
        {
            if(loc.getLocationNo() == s)
            {
                locations.remove(loc);
            }
        }
    }

    @Override
    public Location read(String s)
    {
        Location local = new Location.Builder().build();

        for (Location loc: locations)
        {
            if(loc.getLocationNo() == s)
            {
                local = loc;
            }
        }
        return local;
    }
}
