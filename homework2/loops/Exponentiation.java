package homework2.loops;

import homework1.UserInput;

public class Exponentiation {
    public static void main(String[] args) {
        double number = UserInput.getUserInputDouble("Введите число:");
        int powerOfNumber = UserInput.getUserInputInt("Введите целую положительную степень числа:");
        double result = 1.0;
        if (powerOfNumber > 0) {
            System.out.println("Степень должна быть положительной");
        }
        for (int i = 1; i <= powerOfNumber; i++) {
            result = result * number;
        }
        System.out.println(number + "^" + powerOfNumber + "=" + result);
        // System.out.printf("%.2f^%d=%.6f", number, powerOfNumber, result);
    }
}
