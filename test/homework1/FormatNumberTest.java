package test.homework1;

import homework1.FormatNumber;
import org.easymock.EasyMock;
import org.easymock.Mock;
import org.junit.jupiter.api.Test;
import util.UserInputNotStatic;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * homework1test
 * 28.02.2021
 * Mikhalochkin Kirill
 */
public class FormatNumberTest {
    @Mock
    private final UserInputNotStatic mock = EasyMock.createMock(UserInputNotStatic.class);
    private final FormatNumber number = new FormatNumber(mock);

    @Test
    public void createPhoneNumberTest() {

        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        assertEquals("(123) 456-7890", number.createPhoneNumber(array));
    }

    @Test
    public void testInputNumbers() {
        EasyMock.expect(mock.getUserInputInt("Введите цифру номера:")).andReturn(5).times(10);
        EasyMock.replay(mock);
        var a = number.inputNumbers();
        EasyMock.verify(mock);
        assertArrayEquals(new Integer[]{5, 5, 5, 5, 5, 5, 5, 5, 5, 5}, a);
    }
}
