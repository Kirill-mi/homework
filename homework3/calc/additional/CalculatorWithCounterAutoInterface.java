package homework3.calc.additional;

import homework3.calc.api.ICalculator;

/**
 * homework3.Task9
 * 23.01.2021
 * Mikhalochkin Kirill
 */
public class CalculatorWithCounterAutoInterface implements ICalculator {
    private final ICalculator calc;
    private long count = 0;


    public CalculatorWithCounterAutoInterface(ICalculator calc) {
        this.calc = calc;
    }

    @Override
    public double addNumbers(double firstNumber, double secondNumber) {
        count++;
        return calc.addNumbers(firstNumber, secondNumber);
    }

    @Override
    public double subtractNumbers(double firstNumber, double secondNumber) {
        count++;
        return calc.subtractNumbers(firstNumber, secondNumber);
    }

    @Override
    public double multiplyNumbers(double firstNumber, double secondNumber) {
        count++;
        return calc.multiplyNumbers(firstNumber, secondNumber);
    }

    @Override
    public double divideNumbers(double firstNumber, double secondNumber) {
        count++;
        return calc.divideNumbers(firstNumber, secondNumber);
    }

    @Override
    public double raiseToDegree(double number, double degree) {
        count++;
        return calc.raiseToDegree(number, degree);
    }

    @Override
    public double findSqrt(double number) {
        count++;
        return calc.findSqrt(number);
    }

    @Override
    public double findAbsOfNumber(double number) {
        count++;
        return calc.findAbsOfNumber(number);
    }

    public long getCountOperation() {
        return count;
    }
}
