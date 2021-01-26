package homework3.calc.additional;

import homework3.calc.simple.CalculatorWithMathCopy;
import homework3.calc.simple.CalculatorWithMathExtends;
import homework3.calc.simple.CalculatorWithOperator;

/**
 * homework3.Task7
 * 23.01.2021
 * Mikhalochkin Kirill
 */
public class CalculatorWithCounterAutoComposite {
    private CalculatorWithOperator calc1;
    private CalculatorWithMathCopy calc2;
    private CalculatorWithMathExtends calc3;
    private long count = 0;

    public CalculatorWithCounterAutoComposite(CalculatorWithOperator calc1) {
        this.calc1 = calc1;
    }

    public CalculatorWithCounterAutoComposite(CalculatorWithMathCopy calc2) {
        this.calc2 = calc2;
    }

    public CalculatorWithCounterAutoComposite(CalculatorWithMathExtends calc3) {
        this.calc3 = calc3;
    }

    public double addNumbers(double firstNumber, double secondNumber) {
        count++;
        if (calc1 != null) {
            return calc1.addNumbers(firstNumber, secondNumber);
        } else if (calc2 != null) {
            return calc2.addNumbers(firstNumber, secondNumber);
        } else {
            return calc3.addNumbers(firstNumber, secondNumber);
        }
    }

    public double subtractNumbers(double firstNumber, double secondNumber) {
        count++;
        if (calc1 != null) {
            return calc1.subtractNumbers(firstNumber, secondNumber);
        } else if (calc2 != null) {
            return calc2.subtractNumbers(firstNumber, secondNumber);
        } else {
            return calc3.subtractNumbers(firstNumber, secondNumber);
        }
    }

    public double multiplyNumbers(double firstNumber, double secondNumber) {
        count++;
        if (calc1 != null) {
            return calc1.multiplyNumbers(firstNumber, secondNumber);
        } else if (calc2 != null) {
            return calc2.multiplyNumbers(firstNumber, secondNumber);
        } else {
            return calc3.multiplyNumbers(firstNumber, secondNumber);
        }
    }

    public double divideNumbers(double firstNumber, double secondNumber) {
        count++;
        if (calc1 != null) {
            return calc1.divideNumbers(firstNumber, secondNumber);
        } else if (calc2 != null) {
            return calc2.divideNumbers(firstNumber, secondNumber);
        } else {
            return calc3.divideNumbers(firstNumber, secondNumber);
        }
    }

    public double raiseToDegree(double number, double degree) {
        count++;
        if (calc1 != null) {
            return calc1.raiseToDegree(number, degree);
        } else if (calc2 != null) {
            return calc2.raiseToDegree(number, degree);
        } else {
            return calc3.raiseToDegree(number, degree);
        }
    }

    public double findSqrt(double number) {
        count++;
        if (calc1 != null) {
            return calc1.findSqrt(number);
        } else if (calc2 != null) {
            return calc2.findSqrt(number);
        } else {
            return calc3.findSqrt(number);
        }
    }

    public double findAbsOfNumber(double number) {
        count++;
        if (calc1 != null) {
            return calc1.findAbsOfNumber(number);
        } else if (calc2 != null) {
            return calc2.findAbsOfNumber(number);
        } else {
            return calc3.findAbsOfNumber(number);
        }
    }

    public long getCountOperation() {
        return count;
    }
}
