import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CalculatorTest {
    Calculator calculator = new Calculator();
    private static final double DELTA = 1e-15;

    @Test
    public void sqRootTruePositive(){
        assertEquals("Finding Square Root for True Positive",4.0,calculator.sqRoot(16),DELTA);
        assertEquals("Finding Square Root for True Positive",3.872983346207417,calculator.sqRoot(15),DELTA);
    }
    @Test
    public void sqRootFalsePositive(){
        assertNotEquals("Finding Square Root for True Negative",5.13315,calculator.sqRoot(17),DELTA);
        assertNotEquals("Finding Square Root for True Negative",2.1616546513,calculator.sqRoot(5),DELTA);
    }
    @Test
    public void factorialTruePositive(){
        assertEquals("Finding factorial for True Positive",120,calculator.fact(5));
        assertEquals("Finding factorial for True Positive",720,calculator.fact(6));
    }
    @Test
    public void factorialTrueNegative(){
        assertNotEquals("Finding factorial for True Negative",5,calculator.fact(5));
        assertNotEquals("Finding factorial for True Negative",1502,calculator.fact(7));
    }
    @Test
    public void naturalLogTruePositive(){
        assertEquals("Finding Natural Log for True Positive",2.0794415416798357,calculator.naturalLog(8),DELTA);
        assertEquals("Finding Natural Log for True Positive",5.298317366548036,calculator.naturalLog(200),DELTA);
    }
    @Test
    public void naturalLogTrueNegative(){
        assertNotEquals("Finding Natural Log for True Negative",1.156165165,calculator.fact(5),DELTA);
        assertNotEquals("Finding Natural Log for True Negative",-3.1234681,calculator.fact(6),DELTA);
    }
    @Test
    public void powerTruePositive(){
        assertEquals("Finding Power for True Positive",15625.0,calculator.power(5,6),DELTA);
        assertEquals("Finding Power for True Positive",6561.0,calculator.power(3,8),DELTA);
    }
    @Test
    public void powerTrueNegative(){
        assertNotEquals("Finding Power for True Negative",36.0,calculator.power(2,5),DELTA);
        assertNotEquals("Finding Power for True Negative",72002.0,calculator.power(6,8),DELTA);
    }
}
