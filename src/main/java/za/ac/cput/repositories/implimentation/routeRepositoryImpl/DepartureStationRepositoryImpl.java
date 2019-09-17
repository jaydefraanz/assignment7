package za.ac.cput.repositories.implimentation.routeRepositoryImpl;

import za.ac.cput.domain.route.DepartureStation;
import za.ac.cput.repositories.routeRepository.DepartureStationRepository;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DepartureStationRepositoryImpl implements DepartureStationRepository {

    private static DepartureStationRepository repository = null;
    private Set<DepartureStation> departureStations;

    public DepartureStationRepositoryImpl(){this.departureStations = new HashSet<>(); }

    public static DepartureStationRepository getRepository()
    {
        if(repository == null) repository = new DepartureStationRepositoryImpl();
        return repository;
    }

    @Override
    public Set<DepartureStation> getAll() {
        return departureStations;
    }

    @Override
    public DepartureStation create(DepartureStation departureStation)
    {
        departureStations.add(departureStation);
        return departureStation;
    }

    @Override
    public DepartureStation update(DepartureStation departureStation)
    {
        Iterator<DepartureStation> it = this.departureStations.iterator();

        while(it.hasNext())
        {
            if(this.departureStations.contains(departureStation))
            {
                this.departureStations.remove(departureStation);
                this.departureStations.add(departureStation);
                break;
            }
            else
            {
                this.departureStations.add(departureStation);
            }
            it.next();
        }
        return departureStation;
    }

    @Override
    public void delete(String s)
    {
        for (DepartureStation dept: departureStations)
        {
            if(dept.getStationId() == s)
            {
                departureStations.remove(dept);
            }
        }
    }

    @Override
    public DepartureStation read(String s)
    {
        DepartureStation deptStation = new DepartureStation.Builder().build();

        for (DepartureStation dept: departureStations)
        {
            if(dept.getStationId() == s)
            {
                deptStation = dept;
            }
        }
        return deptStation;
    }
}
