package za.ac.cput.repositories.implimentation.RouteRepositoryImpl;

import za.ac.cput.Domain.Route.DestinationStation;
import za.ac.cput.repositories.RouteRepository.DestinationStationRepository;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DestinationStationRepositoryImpl implements DestinationStationRepository {

    private static DestinationStationRepository repository = null;
    private Set<DestinationStation> destinationStations;

    public DestinationStationRepositoryImpl(){this.destinationStations = new HashSet<>(); }

    public static DestinationStationRepository getRepository()
    {
        if(repository == null) repository = new DestinationStationRepositoryImpl();
        return repository;
    }


    @Override
    public Set<DestinationStation> getAll() {
        return destinationStations;
    }

    @Override
    public DestinationStation create(DestinationStation destinationStation)
    {
        this.destinationStations.add(destinationStation);
        return destinationStation;
    }

    @Override
    public DestinationStation update(DestinationStation destinationStation)
    {
        Iterator<DestinationStation> it = this.destinationStations.iterator();

        while(it.hasNext())
        {
            if(this.destinationStations.contains(destinationStation))
            {
                this.destinationStations.remove(destinationStation);
                this.destinationStations.add(destinationStation);
                break;
            }
            else
            {
                this.destinationStations.add(destinationStation);
            }
            it.next();
        }
        return destinationStation;
    }

    @Override
    public void delete(String s)
    {
        for (DestinationStation desStation: destinationStations)
        {
            if(desStation.getStationId() == s)
            {
                destinationStations.remove(desStation);
            }
        }
    }

    @Override
    public DestinationStation read(String s)
    {
        DestinationStation destination = null;
        for (DestinationStation desStation: destinationStations)
        {
            if(desStation.getStationId() == s)
            {
                destination = desStation;
            }
        }
        return destination;
    }
}
