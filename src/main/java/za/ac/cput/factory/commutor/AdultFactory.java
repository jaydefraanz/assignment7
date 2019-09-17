package za.ac.cput.factory.commutor;

import za.ac.cput.domain.commutors.Adult;

public class AdultFactory
{
    public static Adult getAdult(int age)
    {
        return  new Adult.Builder()
                .age(age)
                .build();
    }
}
