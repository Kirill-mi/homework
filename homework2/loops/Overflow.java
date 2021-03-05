package homework2.loops;

import util.UserInput;

public class Overflow {
    int multiplier = UserInput.getUserInputInt("Введите целочисленный множитель:");

    public long findNumberBeforeOverflow(int multiplier) {
        long a = 1;
        while (Math.abs(a) <= Long.MAX_VALUE / Math.abs(multiplier)) {
            a *= multiplier;
        }
        return a;
    }

    public long findNumberAfterOverflow(int multiplier) {
        return (findNumberBeforeOverflow(multiplier) * multiplier);
    }
}