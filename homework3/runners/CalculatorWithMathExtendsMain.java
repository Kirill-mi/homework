package homework3.runners;

import homework3.calc.simple.CalculatorWithMathExtends;

/**
 * homework3.Task4
 * 22.01.2021
 * Mikhalochkin Kirill
 */
public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        double result;
        double temp;
        // result = 4.1 + 15 * 7 + ((float) 28 / 5 * (float) 28 / 5);
        CalculatorWithMathExtends calc1 = new CalculatorWithMathExtends();
        result = calc1.divideNumbers(28, 5);
        result = calc1.raiseToDegree(result, 2);
        temp = calc1.multiplyNumbers(15, 7);
        result = calc1.addNumbers(temp, result);
        result = calc1.addNumbers(4.1, result);
        System.out.print("Result: ");
        System.out.printf("%.2f", result);
    }
}
