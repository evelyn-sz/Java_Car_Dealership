import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    Customer customer;

    @Before
    public void setUp(){
        customer = new Customer(1000.00);
    }

    @Test
    public void hasMoney(){
        assertEquals(1000.00, customer.getMoney(), 0.0);
    }

    @Test
    public void carCollectionStartsEmpty(){
        assertEquals(0, customer.getNumberOfOwnedCars());
    }
}
