import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TyreTest {
    Tyre tyre;

    @Before
    public void setUp(){
        tyre = new Tyre("Michelin");
    }

    @Test
    public void hasBrand() {
        assertEquals("Michelin", tyre.getBrand());
    }
}
