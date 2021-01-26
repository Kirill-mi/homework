package homework3.calc.additional;

import homework3.calc.simple.CalculatorWithMathExtends;

/**
 * homework3.Task6
 * 23.01.2021
 * Mikhalochkin Kirill
 */
public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
    private long count = 0;

    @Override
    public double raiseToDegree(double number, double degree) {
        count++;
        return super.raiseToDegree(number, degree);
    }

    @Override
    public double findSqrt(double number) {
        count++;
        return super.findSqrt(number);
    }

    @Override
    public double findAbsOfNumber(double number) {
        count++;
        return super.findAbsOfNumber(number);
    }

    @Override
    public double addNumbers(double firstNumber, double secondNumber) {
        count++;
        return super.addNumbers(firstNumber, secondNumber);
    }

    @Override
    public double subtractNumbers(double firstNumber, double secondNumber) {
        count++;
        return super.subtractNumbers(firstNumber, secondNumber);
    }

    @Override
    public double multiplyNumbers(double firstNumber, double secondNumber) {
        count++;
        return super.multiplyNumbers(firstNumber, secondNumber);
    }

    @Override
    public double divideNumbers(double firstNumber, double secondNumber) {
        count++;
        return super.divideNumbers(firstNumber, secondNumber);
    }

    public long getCountOperation() {
        return count;
    }
}
