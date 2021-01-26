package homework3.calc.additional;

import homework3.calc.simple.CalculatorWithMathExtends;

/**
 * homework3.Task5
 * 22.01.2021
 * Mikhalochkin Kirill
 */
public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {
    private long count = 0;

    public void incrementCountOperation() {
        count++;
    }

    public long getCountOperation() {
        return count;
    }
}
