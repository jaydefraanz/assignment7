package za.ac.cput.Factory.Driver;

import za.ac.cput.Domain.Driver.DriverDetails;

public class DriverDetailsFactory
{
    public static DriverDetails getDriverDetail(String name,String surname,String idNo)
    {
        return  new DriverDetails.Builder()
                .idNo(idNo)
                .name(name)
                .surname(surname)
                .build();
    }
}
