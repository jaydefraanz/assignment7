package za.ac.cput.repositories.implimentation.BusRepositoryImp;

import za.ac.cput.Domain.Bus.BusDetails;
import za.ac.cput.repositories.BusRepository.BusDetailsRepository;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class BusDetailRepositoryImpl implements BusDetailsRepository {

    private static BusDetailsRepository repository = null;
    public Set<BusDetails> busDetails;

    public BusDetailRepositoryImpl(){this.busDetails = new HashSet<>(); }

    public static BusDetailsRepository getRepository(){
        if(repository == null) repository = new BusDetailRepositoryImpl();
        return repository;
    }


    @Override
    public Set<BusDetails> getAll()
    {
        return busDetails;
    }

    @Override
    public BusDetails create(BusDetails busDetails)
    {
        this.busDetails.add(busDetails);
        return busDetails;
    }

    @Override
    public BusDetails update(BusDetails busDetails)
    {
        Iterator<BusDetails> it = this.busDetails.iterator();

        while(it.hasNext())
        {
           if(this.busDetails.contains(busDetails))
           {
               System.out.println("updating details");
               this.busDetails.remove(busDetails);
               this.busDetails.add(busDetails);
               break;
           }
           else
           {
               System.out.println("adding new details");
               this.busDetails.add(busDetails);
           }
           it.next();
        }
        return busDetails;
    }

    @Override
    public void delete(String s)
    {
        for (BusDetails busDtail: busDetails)
        {
            if(busDtail.getBusNo() == s)
            {
                busDetails.remove(busDtail);
            }
        }
    }

    @Override
    public BusDetails read(String s)
    {
        BusDetails bdts = new BusDetails.Builder().build();
        for (BusDetails busDtail: busDetails)
        {
            if(busDtail.getBusNo() == s)
            {
               bdts = busDtail;
            }
        }

        return bdts;
    }
}