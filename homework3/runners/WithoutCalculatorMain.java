package homework3.runners;

/**
 * homework3.Task1
 * 22.01.2021
 * Mikhalochkin Kirill
 */
public class WithoutCalculatorMain {
    public static void main(String[] args) {
        double result;
        result = 4.1 + 15 * 7 + ((float) 28 / 5 * (float) 28 / 5);
        System.out.print("Result: ");
        System.out.printf("%.2f", result);
    }
}
