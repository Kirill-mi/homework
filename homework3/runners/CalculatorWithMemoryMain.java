package homework3.runners;

import homework3.calc.additional.CalculatorWithMemory;

/**
 * homework3.Task10
 * 22.01.2021
 * Mikhalochkin Kirill
 */
public class CalculatorWithMemoryMain {
    public static void main(String[] args) {
        // result = 4.1 + 15 * 7 + ((float) 28 / 5 * (float) 28 / 5);
        CalculatorWithMemory calc = new CalculatorWithMemory();
        calc.divideNumbers(28, 5);
        calc.saveMemoryResult();
        calc.raiseToDegree(calc.getMemoryResult(), 2);
        calc.saveMemoryResult();
        calc.addNumbers(calc.multiplyNumbers(15, 7), calc.getMemoryResult());
        calc.saveMemoryResult();
        calc.addNumbers(4.1, calc.getMemoryResult());
        calc.saveMemoryResult();
        System.out.print("Result:");
        System.out.printf("%.2f", calc.getMemoryResult());
        System.out.print("\n"+"Result:");
        System.out.printf("%.2f", calc.addNumbers(4.1, calc.addNumbers(calc.multiplyNumbers(15, 7),
                calc.raiseToDegree(calc.divideNumbers(28, 5), 2))));
    }
}
