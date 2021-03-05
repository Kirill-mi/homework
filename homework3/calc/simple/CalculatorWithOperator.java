package homework3.calc.simple;

import homework3.calc.api.ICalculator;

/**
 * Homework3.Task2
 * 22.01.2021
 * Mikhalochkin Kirill
 */
public class CalculatorWithOperator implements ICalculator {

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
        double result = 1.0;
        for (int i = 1; i <= degree; i++) {
            result = result * number;
        }
        return result;
    }

    public double findSqrt(double number) {
        double accuracy = 0.001f;
        double result = number;
        while ((result - number / result) > (result * accuracy)) {
            result = (number / result + result) / 2;
        }
        return Math.round(result);
    }

    public double findAbsOfNumber(double number) {
        if (number < 0) {
            number *= -1;
        }
        return number;
    }
}
