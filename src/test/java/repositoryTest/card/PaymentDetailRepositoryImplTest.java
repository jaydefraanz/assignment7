package repositoryTest.card;

import org.junit.Test;
import za.ac.cput.domain.card.PaymentDetail;
import za.ac.cput.repositories.implimentation.cardRepositoryImp.PaymentDetailRepositoryImpl;

import static org.junit.Assert.*;

public class PaymentDetailRepositoryImplTest {

    PaymentDetailRepositoryImpl pmri = new PaymentDetailRepositoryImpl();
    PaymentDetail pm;

    @Test
    public void getAll()
    {
        pm = new PaymentDetail.Builder().build();
        assertTrue(pmri.getAll().size() == 0);
    }

    @Test
    public void create()
    {
        pm = (PaymentDetail) new PaymentDetail.Builder().uniquePaymentNo("20").build();
        pmri.create(pm);

        assertTrue(pmri.getAll().size() ==1);
    }

    @Test
    public void update()
    {
        pm = (PaymentDetail) new PaymentDetail.Builder().uniquePaymentNo("202").cardNo("20").build();
        pmri.create(pm);
        pm = (PaymentDetail) new PaymentDetail.Builder().uniquePaymentNo("2052").cardNo("20").build();

        assertTrue(pmri.getAll().size() ==1);

    }

    @Test
    public void delete()
    {
        pm = (PaymentDetail) new PaymentDetail.Builder().uniquePaymentNo("202").cardNo("20").build();
        pmri.create(pm);
        pmri.delete("20");

        assertTrue(pmri.getAll().isEmpty());
    }

    @Test
    public void read()
    {
        pm = (PaymentDetail) new PaymentDetail.Builder().uniquePaymentNo("202").cardNo("20").build();
        pmri.create(pm);
        pm = (PaymentDetail) new PaymentDetail.Builder().uniquePaymentNo("205").cardNo("30").build();
        pmri.create(pm);

        assertTrue(pmri.getAll().size() == 2);

    }
}