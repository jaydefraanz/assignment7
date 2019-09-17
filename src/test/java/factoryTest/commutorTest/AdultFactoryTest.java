package factoryTest.commutorTest;

import org.junit.Test;
import za.ac.cput.domain.commutors.Adult;
import za.ac.cput.factory.commutor.AdultFactory;

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