package homework3.calc.api;

/**
 * homework3.Task8
 * 22.01.2021
 * Mikhalochkin Kirill
 */
public interface ICalculator {

    double addNumbers(double firstNumber, double secondNumber);

    double subtractNumbers(double firstNumber, double secondNumber);

    double multiplyNumbers(double firstNumber, double secondNumber);

    double divideNumbers(double firstNumber, double secondNumber);

    double raiseToDegree(double number, double degree);

    double findSqrt(double number);

    double findAbsOfNumber(double number);
}
