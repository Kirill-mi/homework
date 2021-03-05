package test.homework2.loops;

import homework2.loops.ProductOfDigitsOfNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * homework2test
 * 02.03.2021
 * Mikhalochkin Kirill
 */
public class ProductOfDigitsOfNumberTest {

    private final ProductOfDigitsOfNumber product = new ProductOfDigitsOfNumber();

    @Test
    public void testFindProductOfNumbers() {
        assertEquals(30, product.findProductOfNumbers(new String[]{"235"}));
        assertEquals(10080, product.findProductOfNumbers(new String[]{"181232375"}));
        assertEquals(1, product.findProductOfNumbers(new String[]{"1"}));
        try {
            product.findProductOfNumbers(new String[]{"aaa"});
            Assertions.fail();
        } catch (NumberFormatException ex) {
            assertEquals("Введено не число", ex.getMessage());

        }
        try {
            product.findProductOfNumbers(new String[]{"11.5"});
            Assertions.fail();
        } catch (NumberFormatException e) {
            assertEquals("Введено не целое число", e.getMessage());
        }
    }
}
