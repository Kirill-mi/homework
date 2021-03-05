package test.homework2.loops;

import homework2.loops.FactorialOfUserNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/**
 * homework2test
 * 28.02.2021
 * Mikhalochkin Kirill
 */
public class FactorialOfUserNumberTest {
    private final FactorialOfUserNumber factorial = new FactorialOfUserNumber();

    @Test
    public void testVerifiedInput() {
        assertFalse(factorial.verifiedInput(new String[]{"22"}));
        assertTrue(factorial.verifiedInput(new String[]{"19"}));
        assertTrue(factorial.verifiedInput(new String[]{"0"}));
        assertFalse(factorial.verifiedInput(new String[]{"-1"}));
    }

    @Test
    public void testFindFactorial() {
        assertEquals(1, factorial.findFactorial(0));
        assertEquals(1, factorial.findFactorial(1));
        assertEquals(2, factorial.findFactorial(2));
        assertEquals(6, factorial.findFactorial(3));
        assertEquals(3_628_800, factorial.findFactorial(10));
        assertEquals(1_307_674_368_000L, factorial.findFactorial(15));
    }

    @Test
    public void testFindRecursionFactorial() {
        assertEquals(1, factorial.findRecursionFactorial(0));
        assertEquals(1, factorial.findRecursionFactorial(1));
        assertEquals(2, factorial.findRecursionFactorial(2));
        assertEquals(6, factorial.findRecursionFactorial(3));
        assertEquals(3_628_800, factorial.findRecursionFactorial(10));
        assertEquals(1_307_674_368_000L, factorial.findRecursionFactorial(15));
    }
}
