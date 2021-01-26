package homework3.runners;

import homework3.calc.additional.CalculatorWithCounterClassic;

/**
 * homework3.Task5
 * 23.01.2021
 * Mikhalochkin Kirill
 */
public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        double result;
        double temp;
        // result = 4.1 + 15 * 7 + ((float) 28 / 5 * (float) 28 / 5);
        CalculatorWithCounterClassic calc = new CalculatorWithCounterClassic();
        result = calc.divideNumbers(28, 5);
        calc.incrementCountOperation();
        result = calc.raiseToDegree(result, 2);
        calc.incrementCountOperation();
        temp = calc.multiplyNumbers(15, 7);
        calc.incrementCountOperation();
        result = calc.addNumbers(temp, result);
        calc.incrementCountOperation();
        result = calc.addNumbers(4.1, result);
        calc.incrementCountOperation();
        System.out.print("Result:");
        System.out.printf("%.2f", result);
        System.out.println();
        System.out.println("Counter:" + calc.getCountOperation());
    }
}
