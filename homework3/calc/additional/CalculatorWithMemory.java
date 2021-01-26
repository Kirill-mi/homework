package homework3.calc.additional;

import homework3.calc.simple.CalculatorWithMathCopy;

/**
 * homework3.Task10
 * 24.01.2021
 * Mikhalochkin Kirill
 */
public class CalculatorWithMemory extends CalculatorWithMathCopy {
    private double result;
    private double memoryResult;

    @Override
    public double addNumbers(double firstNumber, double secondNumber) {
        result = super.addNumbers(firstNumber, secondNumber);
        return result;
    }

    @Override
    public double subtractNumbers(double firstNumber, double secondNumber) {
        result = super.subtractNumbers(firstNumber, secondNumber);
        return result;
    }

    @Override
    public double multiplyNumbers(double firstNumber, double secondNumber) {
        result = super.multiplyNumbers(firstNumber, secondNumber);
        return result;
    }

    @Override
    public double divideNumbers(double firstNumber, double secondNumber) {
        result = super.divideNumbers(firstNumber, secondNumber);
        return result;
    }

    @Override
    public double raiseToDegree(double number, double degree) {
        result = super.raiseToDegree(number, degree);
        return result;
    }

    @Override
    public double findSqrt(double number) {
        result = super.findSqrt(number);
        return result;
    }

    @Override
    public double findAbsOfNumber(double number) {
        result = super.findAbsOfNumber(number);
        return result;
    }

    public void saveMemoryResult() {
        memoryResult = result;
    }

    public double getMemoryResult() {
        double temp = memoryResult;
        memoryResult = 0;
        return temp;
    }
}
