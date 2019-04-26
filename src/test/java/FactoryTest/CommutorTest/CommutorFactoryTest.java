package FactoryTest.CommutorTest;


import org.junit.Test;
import za.ac.cput.Domain.Commutors.Commutor;
import za.ac.cput.Factory.Commutor.CommutorFactory;

import static org.junit.Assert.assertTrue;

public class CommutorFactoryTest
{

    @Test
    public void getCommutor()
    {
        String name = "Jay";
        String surn = "Program";
        int card = 384373;
        int credit = 100;

        Commutor com = CommutorFactory.getCommutor(name,surn,card,credit);

        assertTrue(com.getCredit() > 50);
    }
}