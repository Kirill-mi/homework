package test.homework1;

import homework1.api.ICommunicationPrinter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * homework1test
 * 28.02.2021
 * Mikhalochkin Kirill
 */
public abstract class ChoiceNameBaseTest {
    private final ICommunicationPrinter iCommunicationPrinter;

    public ChoiceNameBaseTest(ICommunicationPrinter iCommunicationPrinter) {
        this.iCommunicationPrinter = iCommunicationPrinter;
    }

    @Test
    public void testWelcomeFirstName() {
        testName("Вася", "Привет!\nЯ тебя так долго ждал");
    }

    @Test
    public void testWelcomeSecondName() {
        testName("Анастасия", "Я тебя так долго ждал");
    }

    @Test
    public void testWelcomeName() {
        testName("Test", "Добрый день. А вы кто?");
    }

    private void testName(String test, String expected) {
        assertEquals(expected, iCommunicationPrinter.welcome(test));
    }
}
