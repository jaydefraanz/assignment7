package za.ac.cput.repositories.CommutorsRepository;

import za.ac.cput.Domain.Commutors.Adult;
import za.ac.cput.repositories.IRepository;

import java.util.Set;

public interface AdultCommutorRepository extends IRepository<Adult,String>
{
    Set<Adult> getAll();
}
