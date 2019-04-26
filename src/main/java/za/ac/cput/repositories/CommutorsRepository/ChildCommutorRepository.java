package za.ac.cput.repositories.CommutorsRepository;

import za.ac.cput.Domain.Commutors.Child;
import za.ac.cput.repositories.IRepository;

import java.util.Set;

public interface ChildCommutorRepository extends IRepository<Child, String>
{
    Set<Child> getAll();
}
