package powerpackage;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PowerTest {

    @Test
    public void oneRaisedToOneIsOne() {
        assertEquals(1, PowerFinder.calculatePower(1, 1));
    }

    @Test
    public void twoRaisedToOneIsTwo() {
        assertEquals(2, PowerFinder.calculatePower(2, 1));
    }

    @Test
    public void twoRaisedToTwoIsFour() {
        assertEquals(4, PowerFinder.calculatePower(2, 2));
    }

    @Test
    public void threeRaisedToTwoIsNine() {
        assertEquals(9, PowerFinder.calculatePower(3, 2));
    }

    @Test
    public void anyNumberRaisedToZeroIsOne() {
        assertEquals(1, PowerFinder.calculatePower(5, 0));
    }
}