package za.ac.cput.repositories.implimentation.RouteRepositoryImpl;

import za.ac.cput.Domain.Route.DestinationStation;
import za.ac.cput.repositories.RouteRepository.DestinationStationRepository;

import java.util.HashSet;
import java.util.Set;

public class DestinationStationRepositoryImpl implements DestinationStationRepository {

    private static DestinationStationRepository repository = null;
    private Set<DestinationStation> destinationStations;

    private DestinationStationRepositoryImpl(){this.destinationStations = new HashSet<>(); }

    public static DestinationStationRepository getRepository()
    {
        if(repository == null) repository = new DestinationStationRepositoryImpl();
        return repository;
    }


    @Override
    public Set<DestinationStation> getAll() {
        return null;
    }

    @Override
    public DestinationStation create(DestinationStation destinationStation) {
        return null;
    }

    @Override
    public DestinationStation update(DestinationStation destinationStation) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public DestinationStation read(String s) {
        return null;
    }
}
