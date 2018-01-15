import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Adult adult;
    Child child1;
    Child child2;

    @Before

    public void before(){
        adult = new Adult(25, 180, 25.00);
        child1 = new Child(10, 150, 8.00);

    }

    @Test
    public void canGetAge() {
        assertEquals(25, adult.getAge());
    }

    @Test
    public void canGetHeight() {
        assertEquals(150, child1.getHeight());
    }

    @Test
    public void canGetMoney() {
        assertEquals(25, adult.getMoney(), 0.01);
    }

    @Test

    public void childCanAskQuestion(){
        assertEquals("Can this Waltzer go faster ?", child1.askQuestion("Waltzer"));
    }

    @Test

    public void adultCanAskQuestion(){
        assertEquals("Can this Rollercoaster go slower ?", adult.askQuestion("Rollercoaster"));
    }
}
