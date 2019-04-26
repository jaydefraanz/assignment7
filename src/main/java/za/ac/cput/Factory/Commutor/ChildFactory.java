package za.ac.cput.Factory.Commutor;

import za.ac.cput.Domain.Commutors.Child;

public class ChildFactory
{
    public static Child getChild(int age)
    {
        return new Child.Builder()
                .age(age)
                .build();
    }
}
