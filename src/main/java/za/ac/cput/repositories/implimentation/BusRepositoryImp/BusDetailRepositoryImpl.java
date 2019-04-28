package za.ac.cput.repositories.implimentation.BusRepositoryImp;

import za.ac.cput.Domain.Bus.BusDetails;
import za.ac.cput.repositories.BusRepository.BusDetailsRepository;

import java.util.HashSet;
import java.util.Set;

public class BusDetailRepositoryImpl implements BusDetailsRepository {

    private static BusDetailsRepository repository = null;
    private Set<BusDetails> busDetails;

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
        for (int i = 0; i < this.busDetails.size(); i++)
        {
                  if(this.busDetails.contains(busDetails.getBusNo()))
                  {
                      //remove the current details
                      this.busDetails.remove(busDetails.getBusNo());
                      //add the new information
                      this.busDetails.add(busDetails);
                  }
        }
        return busDetails;
    }

    @Override
    public void delete(String s)
    {
        this.busDetails.remove(s);
    }

    @Override
    public BusDetails read(String s)
    {
        for (int i = 0; i < this.busDetails.size(); i++)
        {

            if (this.busDetails.contains(s))
            {
                System.out.println("found");
                System.out.println(busDetails.toString());
            }
        }

        return read(s);
    }
}
