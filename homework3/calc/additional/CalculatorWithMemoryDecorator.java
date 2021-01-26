package homework3.calc.additional;

import homework3.calc.api.ICalculator;

/**
 * homework3.Task11
 * 24.01.2021
 * Mikhalochkin Kirill
 */
public class CalculatorWithMemoryDecorator implements IMemory {

    private final ICalculator calc;
    private static double result;
    private double memoryResult;

    public CalculatorWithMemoryDecorator(ICalculator calc) {
        this.calc = calc;
    }

    @Override
    public double addNumbers(double firstNumber, double secondNumber) {
        result = calc.addNumbers(firstNumber, secondNumber);
        return result;
    }

    @Override
    public double subtractNumbers(double firstNumber, double secondNumber) {
        result = calc.subtractNumbers(firstNumber, secondNumber);
        return result;
    }

    @Override
    public double multiplyNumbers(double firstNumber, double secondNumber) {
        result = calc.multiplyNumbers(firstNumber, secondNumber);
        return result;
    }

    @Override
    public double divideNumbers(double firstNumber, double secondNumber) {
        result = calc.divideNumbers(firstNumber, secondNumber);
        return result;
    }

    @Override
    public double raiseToDegree(double number, double degree) {
        result = calc.raiseToDegree(number, degree);
        return result;
    }

    @Override
    public double findSqrt(double number) {
        result = calc.findSqrt(number);
        return result;
    }

    @Override
    public double findAbsOfNumber(double number) {
        result = calc.findAbsOfNumber(number);
        return result;
    }

    @Override
    public void saveMemoryResult() {
        memoryResult = result;
    }

    @Override
    public double getMemoryResult() {
        double temp = memoryResult;
        memoryResult = 0;
        return temp;
    }

    public ICalculator getCalculator() {
        return calc;
    }
}
