package homework3.runners;

import homework3.calc.additional.CalculatorWithCounterAutoDecorator;
import homework3.calc.additional.CalculatorWithMemoryDecorator;
import homework3.calc.api.ICalculator;
import homework3.calc.additional.ICount;
import homework3.calc.additional.IMemory;
import homework3.calc.simple.CalculatorWithOperator;

/**
 * homework3.task11
 * 22.01.2021
 * Mikhalochkin Kirill
 */
public class CalculatorDecoratorMain {

    public static void main(String[] args) {
        // result = 4.1 + 15 * 7 + ((float) 28 / 5 * (float) 28 / 5);
        ICalculator calculator = new CalculatorWithCounterAutoDecorator
                (new CalculatorWithMemoryDecorator(new CalculatorWithOperator()));
        IMemory memory = new CalculatorWithCounterAutoDecorator
                (new CalculatorWithMemoryDecorator(new CalculatorWithOperator()));
        ICount count = new CalculatorWithCounterAutoDecorator(memory);
        calculator.divideNumbers(28, 5);
        memory.saveMemoryResult();
        calculator.raiseToDegree(memory.getMemoryResult(), 2);
        memory.saveMemoryResult();
        calculator.addNumbers(calculator.multiplyNumbers(15, 7), memory.getMemoryResult());
        memory.saveMemoryResult();
        calculator.addNumbers(4.1, memory.getMemoryResult());
        memory.saveMemoryResult();
        System.out.print("Result:");
        System.out.printf("%.2f", memory.getMemoryResult());
        System.out.println();
        System.out.println("Count:" + count.getCountOperation());
    }
}
