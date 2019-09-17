package za.ac.cput.repositories.commutorsRepository;

import za.ac.cput.domain.commutors.Adult;
import za.ac.cput.repositories.IRepository;

import java.util.Set;

public interface AdultCommutorRepository extends IRepository<Adult,String>
{
    Set<Adult> getAll();
}
