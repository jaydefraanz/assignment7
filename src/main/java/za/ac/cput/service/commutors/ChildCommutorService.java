package za.ac.cput.service.commutors;

import za.ac.cput.domain.commutors.Child;
import za.ac.cput.service.IService;

import java.util.Set;

public interface ChildCommutorService extends IService<Child, String> {
    Set<Child> getAll();
}
