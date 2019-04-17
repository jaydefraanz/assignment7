package za.ac.cput.Factory.Driver;

import za.ac.cput.Domain.Driver.DriverContact;

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
