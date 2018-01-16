import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RideTest {

    RollerCoaster rollerCoaster;
    Waltzer waltzer;
    GhostTrain ghostTrain;
    Adult adult;

    @Before
    public void before(){
        rollerCoaster = new RollerCoaster(4.00, 18, 152);
        waltzer = new Waltzer(3.50, 8,135);
        ghostTrain = new GhostTrain(3.00, 5,125 );
        adult = new Adult(25, 180, 25.00);
    }

    @Test

    public void canGetPrice(){
        assertEquals(4.00, rollerCoaster.getPrice(), 0.01);
    }

    @Test

    public void canGetMinAge(){
        assertEquals(8, waltzer.getMinAge());
    }

    @Test

    public void canGetHeight(){
        assertEquals(125, ghostTrain.getHeight());
    }

    @Test

    public void canStartRide(){
        assertEquals("Ride started", rollerCoaster.startRide());
    }

    @Test

    public void canStopRide(){
        assertEquals("Ride stopped", rollerCoaster.stopRide());
    }

    @Test

    public void canChargeCustomer(){
        assertEquals("You are charged £4.00 and are going on the rollercoaster !", rollerCoaster.charge(adult)) ;
    }

    @Test
    public void waltzerCanPlaySong(){
        assertEquals("You spin me round", waltzer.playSong() );
    }

    @Test
    public void ghostTrainCanPlaySong(){
        assertEquals("Monster Mash", ghostTrain.playSong() );
    }

}
