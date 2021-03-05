package test.homework1;

import homework1.SleepInDefinition;
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
public class SleepInDefinitionTest {
    @ParameterizedTest
    @MethodSource("sleepInArgumentProvider")
    void testSleepIn(boolean weekday, boolean vacation, boolean result) {
        assertEquals(result, SleepInDefinition.sleepIn(weekday, vacation));
    }

    static Stream<Arguments> sleepInArgumentProvider() {
        return Stream.of(
                arguments(true, true, true),
                arguments(false, true, true),
                arguments(false, false, true),
                arguments(true, false, false)
        );
    }
}
