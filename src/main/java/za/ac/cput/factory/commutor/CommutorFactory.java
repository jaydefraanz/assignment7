package za.ac.cput.factory.commutor;

import za.ac.cput.domain.commutors.Commutor;

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
