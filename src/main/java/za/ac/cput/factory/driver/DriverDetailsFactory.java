package za.ac.cput.factory.driver;

import za.ac.cput.domain.driver.DriverDetails;

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
