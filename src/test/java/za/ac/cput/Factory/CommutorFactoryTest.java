package za.ac.cput.Factory;


import za.ac.cput.Domain.Commutor;
import za.ac.cput.Factory.CommutorFactory;
import org.junit.Assert;
import org.junit.Test;

public class CommutorFactoryTest {

    @Test
    public  void getCommutor()
    {
        String name = "jay";
        String surname = "fraanz";
        int cardNo = 154258;
        int credit = 250;

        Commutor com = CommutorFactory.getCommutor(name,surname,cardNo,credit);


    }
}
