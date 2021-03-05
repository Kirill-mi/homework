package test.homework3;

import homework3.calc.api.ICalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * homework3test
 * 22.01.2021
 * Mikhalochkin Kirill
 */
public abstract class CalculatorBaseTest {
    private final ICalculator iCalculator;

    public CalculatorBaseTest(ICalculator iCalculator) {
        this.iCalculator = iCalculator;
    }

    @Test
    public void testAddNumbers() {
        assertEquals(4, iCalculator.addNumbers(1, 3));

    }

    @Test
    public void testSubtractNumbers() {
        assertEquals(-2, iCalculator.subtractNumbers(7, 9));
    }

    @Test
    public void testMultiplyNumbers() {
        assertEquals(63, iCalculator.multiplyNumbers(7, 9));
    }

    @Test
    public void testDivideNumbers() {
        assertEquals(3, iCalculator.divideNumbers(9, 3));
    }

    @Test
    public void testRaiseToDegree() {
        assertEquals(27, iCalculator.raiseToDegree(3, 3));
    }


    @Test
    public void testFindSqrt() {
        assertEquals(9, iCalculator.findSqrt(81));
    }

    @Test
    public void testFindAbsOfNumber() {
        assertEquals(81, iCalculator.findAbsOfNumber(-81));
    }
}
