package za.ac.cput.Service.Commutors;

import za.ac.cput.Domain.Commutors.Child;
import za.ac.cput.Service.IService;

import java.util.Set;

public interface ChildCommutorService extends IService<Child, String> {
    Set<Child> getAll();
}
