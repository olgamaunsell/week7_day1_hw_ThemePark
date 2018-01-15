import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RideTest {

    RollerCoaster rollerCoaster;
    Waltzer waltzer;
    GhostTrain ghostTrain;

    @Before
    public void before(){
        rollerCoaster = new RollerCoaster(4.20, 18, 152);
        waltzer = new Waltzer(3.50, 8,135);
        ghostTrain = new GhostTrain(3.00, 5,125 );
    }

    @Test

    public void canGetPrice(){
        assertEquals(4.20, rollerCoaster.getPrice(), 0.01);
    }

    @Test

    public void canGetMinAge(){
        assertEquals(8, waltzer.getMinAge());
    }

    @Test

    public void canGetHeight(){
        assertEquals(125, ghostTrain.getHeight());
    }
}
