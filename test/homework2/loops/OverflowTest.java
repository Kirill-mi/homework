package test.homework2.loops;


import homework2.loops.Overflow;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

/**
 * homework2test
 * 28.02.2021
 * Mikhalochkin Kirill
 */
public class OverflowTest {
    private final Overflow overflow = new Overflow();

    @ParameterizedTest
    @MethodSource("findNumberBeforeOverflowArgumentProvider")
    public void testFindNumberBeforeOverflow(int multiplier, long result) {

        assertEquals(result, overflow.findNumberBeforeOverflow(multiplier));
    }

    static Stream<Arguments> findNumberBeforeOverflowArgumentProvider() {
        return Stream.of(
                arguments(3, 4052555153018976267L),
                arguments(188, 1560496482665168896L),
                arguments(-19, 799006685782884121L),
                arguments(50, 4882812500000000000L)
        );
    }

    @ParameterizedTest
    @MethodSource("findNumberAfterOverflowArgumentProvider")
    public void testFindNumberAfterOverflow(int multiplier, long result) {
        assertEquals(result, overflow.findNumberAfterOverflow(multiplier));
    }

    static Stream<Arguments> findNumberAfterOverflowArgumentProvider() {
        return Stream.of(
                arguments(3, -6289078614652622815L),
                arguments(188, -1774566438301073408L),
                arguments(-19, 3265617043834753317L),
                arguments(50, 4332952041775828992L)
        );
    }
}
