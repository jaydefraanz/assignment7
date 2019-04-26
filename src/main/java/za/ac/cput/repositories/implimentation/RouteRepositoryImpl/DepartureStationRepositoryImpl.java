package za.ac.cput.repositories.implimentation.RouteRepositoryImpl;

import za.ac.cput.Domain.Route.DepartureStation;
import za.ac.cput.repositories.RouteRepository.DepartureStationRepository;

import java.util.HashSet;
import java.util.Set;

public class DepartureStationRepositoryImpl implements DepartureStationRepository {

    private static DepartureStationRepository repository = null;
    private Set<DepartureStation> departureStations;

    private DepartureStationRepositoryImpl(){this.departureStations = new HashSet<>(); }

    public static DepartureStationRepository getRepository()
    {
        if(repository == null) repository = new DepartureStationRepositoryImpl();
        return repository;
    }

    @Override
    public Set<DepartureStation> getAll() {
        return null;
    }

    @Override
    public DepartureStation create(DepartureStation departureStation) {
        return null;
    }

    @Override
    public DepartureStation update(DepartureStation departureStation) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public DepartureStation read(String s) {
        return null;
    }
}
