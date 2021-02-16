import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {
    Dealership dealership;
    Car car;

    @Before
    public void setUp(){
        dealership = new Dealership(100000);
        car = new Car(EngineType.DIESEL, 2000, "Blue", "Continental");
    }

    @Test
    public void hasTill(){
        assertEquals(100000, dealership.getTill(), 0.0);
    }

    @Test
    public void carCollectionStartsEmpty(){
        assertEquals(0, dealership.getNumberOfCars());
    }

    @Test
    public void canAddCarToCollection(){
        dealership.addCarToCollection(car);
        assertEquals(1, dealership.getNumberOfCars());
    }
}
