package homework3.calc.simple;

import homework3.calc.api.ICalculator;

/**
 * homework3.Task3
 * 22.01.2021
 * Mikhalochkin Kirill
 */
public class CalculatorWithMathCopy implements ICalculator {

    public double addNumbers(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public double subtractNumbers(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    public double multiplyNumbers(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    public double divideNumbers(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }

    public double raiseToDegree(double number, double degree) {
        return Math.pow(number, degree);
    }

    public double findSqrt(double number) {
        return Math.sqrt(number);
    }

    public double findAbsOfNumber(double number) {
        return Math.abs(number);
    }
}
