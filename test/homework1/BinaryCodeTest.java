package test.homework1;

import homework1.BinaryCode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

/**
 * homework1test
 * 28.02.2021
 * Mikhalochkin Kirill
 */
public class BinaryCodeTest {
    @ParameterizedTest
    @MethodSource("toBinaryStringArgumentProvider")
    void toBinaryStringTest(byte numberDec, String numberBin) {

        assertEquals(numberBin, BinaryCode.toBinaryString(numberDec));
    }

    static Stream<Arguments> toBinaryStringArgumentProvider() {
        return Stream.of(
                arguments((byte) 42, "00101010"),
                arguments((byte) 15, "00001111"),
                arguments((byte) -42, "11010110"),
                arguments((byte) -15, "11110001")
        );
    }
}
