package za.ac.cput.repositories;

import za.ac.cput.Domain.CommutorPkg.Commutor;

import java.util.Set;

public interface CommutorRepository extends IRepository<Commutor, String> {

    Set<Commutor> getAll();
}
