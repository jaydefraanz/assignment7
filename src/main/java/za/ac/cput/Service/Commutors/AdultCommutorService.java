package za.ac.cput.Service.Commutors;

import za.ac.cput.Domain.Commutors.Adult;
import za.ac.cput.Service.IService;

import java.util.Set;

public interface AdultCommutorService extends IService<Adult, String> {
    Set<Adult> getAll();
}
