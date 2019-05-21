package za.ac.cput.Service.Implementation.Route;

import za.ac.cput.Domain.Route.Route;
import za.ac.cput.Service.Route.RouteService;
import za.ac.cput.repositories.RouteRepository.RouteRepository;
import za.ac.cput.repositories.implimentation.RouteRepositoryImpl.RouteRepositoryImpl;

import java.util.Set;

public class RouteServiceImpl implements RouteService {

    private static RouteServiceImpl service = null;
    private RouteRepository repository;

    private RouteServiceImpl(){this.repository = RouteRepositoryImpl.getRepository(); }

    private static RouteServiceImpl getService()
    {
        if (service == null) service = new RouteServiceImpl();
        return service;
    }

    @Override
    public Set<Route> getAll() {
        return repository.getAll();
    }

    @Override
    public Route create(Route route) {
        return repository.create(route);
    }

    @Override
    public Route update(Route route) {
        return repository.update(route);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);
    }

    @Override
    public Route read(String s) {
        return repository.read(s);
    }
}
