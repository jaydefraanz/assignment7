package za.ac.cput.Factory;

import org.junit.Test;
import za.ac.cput.Domain.CommutorPkg.Adult;

import static org.junit.Assert.assertTrue;

public class AdultFactoryTest {

    @Test
    public void getAdult()
    {
        int age = 52;

        Adult adt = AdultFactory.getAdult(age);

        assertTrue(adt.getAge() > 51);

    }
}