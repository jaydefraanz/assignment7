package za.ac.cput.factory.commutor;

import za.ac.cput.domain.commutors.Child;

public class ChildFactory
{
    public static Child getChild(int age)
    {
        return new Child.Builder()
                .age(age)
                .build();
    }
}
