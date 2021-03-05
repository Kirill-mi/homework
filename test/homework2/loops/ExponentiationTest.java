package test.homework2.loops;


import homework2.loops.Exponentiation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * homework2test
 * 02.03.2021
 * Mikhalochkin Kirill
 */
public class ExponentiationTest {
    private final Exponentiation exponentiation = new Exponentiation();

    @Test
    public void testFindExp() {

        assertEquals(1889568.0, exponentiation.findExp(18.0, 5));
        assertEquals(56.25, exponentiation.findExp(7.5, 2));
        try {
            exponentiation.findExp(5, -3);
            Assertions.fail();
        } catch (IllegalArgumentException ex) {
            assertEquals("Степень должна быть положительной", ex.getMessage());
        }
    }
}
