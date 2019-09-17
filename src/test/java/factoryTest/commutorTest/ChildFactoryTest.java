package factoryTest.commutorTest;


import org.junit.Test;
import za.ac.cput.domain.commutors.Child;
import za.ac.cput.factory.commutor.ChildFactory;

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