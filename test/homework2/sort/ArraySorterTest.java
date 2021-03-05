package test.homework2.sort;

import homework2.sort.ArraySorter;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

/**
 * homework2test
 * 01.03.2021
 * Mikhalochkin Kirill
 */
public class ArraySorterTest {
    @ParameterizedTest
    @MethodSource("bubbleSortArgumentProvider")
    public void testBubbleSort(int[] array, int[] expected) {

        assertArrayEquals(expected, ArraySorter.bubbleSort(array));
    }

    static Stream<Arguments> bubbleSortArgumentProvider() {
        return Stream.of(
                arguments(new int[]{1, 2, 3, 4, 5, 6}, new int[]{1, 2, 3, 4, 5, 6}),
                arguments(new int[]{1, 1, 1, 1}, new int[]{1, 1, 1, 1}),
                arguments(new int[]{}, new int[]{}),
                arguments(new int[]{9, 1, 5, 99, 9, 9}, new int[]{1, 5, 9, 9, 9, 99})

        );
    }

    @ParameterizedTest
    @MethodSource("shakeSortArgumentProvider")
    public void testShakeSort(int[] array, int[] expected) {

        assertArrayEquals(expected, ArraySorter.bubbleSort(array));
    }

    static Stream<Arguments> shakeSortArgumentProvider() {
        return Stream.of(
                arguments(new int[]{1, 2, 3, 4, 5, 6}, new int[]{1, 2, 3, 4, 5, 6}),
                arguments(new int[]{1, 1, 1, 1}, new int[]{1, 1, 1, 1}),
                arguments(new int[]{}, new int[]{}),
                arguments(new int[]{9, 1, 5, 99, 9, 9}, new int[]{1, 5, 9, 9, 9, 99})

        );
    }
}
