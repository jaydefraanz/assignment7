package za.ac.cput.Factory.Commutor;

import za.ac.cput.Domain.Commutors.Commutor;

public class CommutorFactory
{
    public static Commutor getCommutor(String name, String surname,String cardNO,int credit)
    {
        return new Commutor.Builder()
                .name(name)
                .surname(surname)
                .cardNo(cardNO)
                .credit(credit)
                .build();
    }
}
