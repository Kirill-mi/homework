package homework3.runners;

import homework3.calc.additional.CalculatorWithCounterAutoInterface;
import homework3.calc.simple.CalculatorWithMathCopy;
import homework3.calc.simple.CalculatorWithMathExtends;
import homework3.calc.simple.CalculatorWithOperator;

/**
 * homework3.Task9
 * 22.01.2021
 * Mikhalochkin Kirill
 */
public class CalculatorWithCounterAutoInterfaceMain {
    public static void main(String[] args) {
        CalculatorWithOperator calc1 = new CalculatorWithOperator();
        CalculatorWithMathCopy calc2 = new CalculatorWithMathCopy();
        CalculatorWithMathExtends calc3 = new CalculatorWithMathExtends();
        CalculatorWithCounterAutoInterface calc = new CalculatorWithCounterAutoInterface(calc3);

        double result;
        double temp;
        // result = 4.1 + 15 * 7 + ((float) 28 / 5 * (float) 28 / 5);
        result = calc.divideNumbers(28, 5);
        result = calc.raiseToDegree(result, 2);
        temp = calc.multiplyNumbers(15, 7);
        result = calc.addNumbers(temp, result);
        result = calc.addNumbers(4.1, result);
        System.out.print("Result:");
        System.out.printf("%.2f", result);
        System.out.println();
        System.out.println("Counter:" + calc.getCountOperation());
    }
}
