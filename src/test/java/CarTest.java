import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {
    Car car;

    @Before
    public void setUp(){
        car = new Car(EngineType.HYBRID, 2000, "Green", "Michelin");
    }

    @Test
    public void hasEngineType(){
        assertEquals(EngineType.HYBRID, car.getEngineType());
    }

    @Test
    public void hasPrice(){
        assertEquals(2000, car.getPrice(), 0.0);
    }

    @Test
    public void hasColour(){
        assertEquals("Green", car.getColour());
    }

    @Test
    public void hasTyres(){
        assertEquals("Michelin", car.getTyres());
    }
}
