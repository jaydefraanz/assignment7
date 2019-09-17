package za.ac.cput.factory.driver;

import za.ac.cput.domain.driver.DriverContact;

public class DriverContactFactory
{
    public static DriverContact getDriverContact(String phone,String email, String address)
    {
        return new DriverContact.Builder()
                .phone(phone)
                .email(email)
                .address(address)
                .builder();
    }
}
