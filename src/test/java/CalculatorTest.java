import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CalculatorTest {
    Calculator calculator = new Calculator();
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
}
