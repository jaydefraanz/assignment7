package za.ac.cput.repositories.commutorsRepository;

import za.ac.cput.domain.commutors.Child;
import za.ac.cput.repositories.IRepository;

import java.util.Set;

public interface ChildCommutorRepository extends IRepository<Child, String>
{
    Set<Child> getAll();
}
