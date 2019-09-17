package za.ac.cput.repositories.implimentation.driverRepositoryImpl;

import za.ac.cput.domain.driver.AssignedBus;
import za.ac.cput.repositories.driverRepository.AssignedBusRepository;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class AssignedBusRepositoryImpl implements AssignedBusRepository {

    private  static AssignedBusRepository repository = null;
    private Set<AssignedBus> assignedBuses;

    public AssignedBusRepositoryImpl(){this.assignedBuses = new HashSet<>(); }

    public static AssignedBusRepository getRepository()
    {
        if (repository == null) repository = new AssignedBusRepositoryImpl();
        return repository;
    }


    @Override
    public Set<AssignedBus> getAll() {
        return assignedBuses;
    }

    @Override
    public AssignedBus create(AssignedBus assignedBus)
    {
        this.assignedBuses.add(assignedBus);
        return assignedBus;
    }

    @Override
    public AssignedBus update(AssignedBus assignedBus)
    {
        Iterator<AssignedBus> it = this.assignedBuses.iterator();

        while(it.hasNext())
        {
            if(this.assignedBuses.contains(assignedBus))
            {
                this.assignedBuses.remove(assignedBus);
                this.assignedBuses.add(assignedBus);
                break;
            }
            else
            {
                this.assignedBuses.add(assignedBus);
            }
            it.next();
        }
        return assignedBus;
    }

    @Override
    public void delete(String s)
    {
        for (AssignedBus asgBus: assignedBuses)
        {
            if(asgBus.getBusNo() == s)
            {
                assignedBuses.remove(asgBus);
            }
        }
    }

    @Override
    public AssignedBus read(String s)
    {
        AssignedBus assignBus = new AssignedBus.Builder().build();
        for (AssignedBus asgBus: assignedBuses)
        {
            if(asgBus.getBusNo() == s)
            {
                assignBus = asgBus;
            }
        }

        return assignBus;
    }
}
