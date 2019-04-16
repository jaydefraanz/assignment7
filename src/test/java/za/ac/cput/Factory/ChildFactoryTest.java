package za.ac.cput.Factory;


import org.junit.Test;
import za.ac.cput.Domain.CommutorPkg.Child;

import static org.junit.Assert.assertEquals;

public class ChildFactoryTest {

    @Test
    public void getChild()
    {
        int age = 13;

        Child aChild = ChildFactory.getChild(age);

        assertEquals(aChild.getAge(),13);
    }
}