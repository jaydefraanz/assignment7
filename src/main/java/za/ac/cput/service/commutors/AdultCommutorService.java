package za.ac.cput.service.commutors;

import za.ac.cput.domain.commutors.Adult;
import za.ac.cput.service.IService;

import java.util.Set;

public interface AdultCommutorService extends IService<Adult, String> {
    Set<Adult> getAll();
}
