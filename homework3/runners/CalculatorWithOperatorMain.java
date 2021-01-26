package homework3.runners;

import homework3.calc.simple.CalculatorWithOperator;

/**
 * homework3.Task2
 * 22.01.2021
 * Mikhalochkin Kirill
 */
public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        double result;
        double temp;
        // result = 4.1 + 15 * 7 + ((float) 28 / 5 * (float) 28 / 5);
        CalculatorWithOperator calc = new CalculatorWithOperator();
        result = calc.divideNumbers(28, 5);
        result = calc.raiseToDegree(result, 2);
        temp = calc.multiplyNumbers(15, 7);
        result = calc.addNumbers(temp, result);
        result = calc.addNumbers(4.1, result);
        System.out.print("Result: ");
        System.out.printf("%.2f", result);
    }
}
