package za.ac.cput.repositories.implimentation.commutorsRepositoryImpl;

import za.ac.cput.domain.commutors.Adult;
import za.ac.cput.repositories.commutorsRepository.AdultCommutorRepository;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class AdultCommutorRepositoryImpl implements AdultCommutorRepository {

    private static AdultCommutorRepository repository = null;
    private Set<Adult> adults;

    public AdultCommutorRepositoryImpl(){this.adults = new HashSet<>(); }

    public static AdultCommutorRepository getRepository()
    {
        if (repository == null) repository = new AdultCommutorRepositoryImpl();
        return repository;
    }


    @Override
    public Set<Adult> getAll() {
        return adults;
    }

    @Override
    public Adult create(Adult adult)
    {
        this.adults.add(adult);
        return adult;
    }

    @Override
    public Adult update(Adult adult)
    {
        Iterator<Adult> it = this.adults.iterator();

        while(it.hasNext())
        {
            if(this.adults.contains(adult))
            {
                this.adults.remove(adult);
                this.adults.add(adult);
                break;
            }
            else
            {
                this.adults.add(adult);
            }
            it.next();
        }
        return adult;
    }

    @Override
    public void delete(String s)
    {
        for (Adult adlt: adults)
        {
            if(adlt.getCardNo() == s)
            {
                adults.remove(adlt);
            }
        }
    }

    @Override
    public Adult read(String s)
    {
        Adult adts = new Adult.Builder().build();

        for (Adult adlt: adults)
        {
            if(adlt.getCardNo() == s)
            {
                adts = adlt;
            }
        }

        return adts;
    }
}
