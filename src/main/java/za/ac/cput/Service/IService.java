package za.ac.cput.Service;

import za.ac.cput.Domain.Driver.DriverDetails;

public interface IService<T, ID> {
    T create (T type);

    T update (T type);

    void delete(ID id);

    T read(ID id);
}
