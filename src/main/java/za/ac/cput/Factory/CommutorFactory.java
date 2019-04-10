package za.ac.cput.Factory;

import za.ac.cput.Domain.Commutor;

public class CommutorFactory
{
    public static Commutor getCommutor(String name, String surname,int cardNO,int credit)
    {
        return new Commutor.Builder()
                .name(name)
                .surname(surname)
                .cardNo(cardNO)
                .credit(credit)
                .build();
    }
}
