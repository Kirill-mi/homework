package test.homework2.arrays;


import homework2.arrays.OperationsWithArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * homework2test
 * 02.03.2021
 * Mikhalochkin Kirill
 */
public class OperationsWithArrayTest {
    OperationsWithArray test = new OperationsWithArray();

    @Test
    public void testSumEvenPositiveElements() {
        assertEquals(9, test.sumEvenPositiveElements(new int[]{1, 2, 3, 4, 5}));
        assertEquals(5, test.sumEvenPositiveElements(new int[]{-9, 2, -3, 4, 5}));
    }

    @Test
    public void testFindMaxElementWithEvenIndex() {
        assertEquals(5, test.findMaxElementWithEvenIndex(new int[]{1, 2, 3, 4, 5}));
        assertEquals(9, test.findMaxElementWithEvenIndex(new int[]{-9, 2, 3, 4, 9}));
    }

    @Test
    public void testFindElementsLessAverage() {
        assertArrayEquals(new int[]{1, 2}, test.findElementsLessAverage(new int[]{1, 2, 3, 4, 5}));
        assertArrayEquals(new int[]{-4, -5}, test.findElementsLessAverage(new int[]{-1, -2, -3, -4, -5}));
    }

    @Test
    public void testFindTwoMinElements() {
        assertArrayEquals(new int[]{1, 2}, test.findTwoMinElements(new int[]{1, 2, 3, 4, 5}));
        assertArrayEquals(new int[]{-5, -1}, test.findTwoMinElements(new int[]{-1, 2, 3, 4, -5}));

    }

    @Test
    public void testReduceArray() {
        assertArrayEquals(new int[]{1, 5}, test.reduceArray(new int[]{1, 2, 3, 4, 5}, 2, 4));
        assertArrayEquals(new int[]{-1, -5}, test.reduceArray(new int[]{-1, 2, 3, 4, -5}, 2, 4));
    }

    @Test
    public void testSumOfNumbersOfElements() {
        assertEquals(15, test.sumOfNumbersOfElements(new int[]{1, 2, 3, 4, 5}));
        assertEquals(16, test.sumOfNumbersOfElements(new int[]{1, 2, 3, 4, 15}));
    }
}
