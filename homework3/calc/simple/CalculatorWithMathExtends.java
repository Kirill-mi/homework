package homework3.calc.simple;

/**
 * homework3.Task4
 * 22.01.2021
 * Mikhalochkin Kirill
 */
public class CalculatorWithMathExtends extends CalculatorWithOperator {
    @Override
    public double raiseToDegree(double number, double degree) {
        return Math.pow(number, degree);
    }

    @Override
    public double findSqrt(double number) {
        return Math.sqrt(number);
    }

    @Override
    public double findAbsOfNumber(double number) {
        return Math.abs(number);
    }
}
