package homework1.part2;

import homework1.UserInput;

public class DefinitionOddNumber {
    public static void main(String[] args) {
                int firstNumber = UserInput.getUserInputInt("Введите первое число");
        int secondNumber = UserInput.getUserInputInt("Введите второе число");

        if (firstNumber % 2 == 0 && secondNumber % 2 == 0) {
            firstNumber++;
        }
        if (firstNumber % 2 != 0) {
            System.out.println("первое число нечетное");
        } else {
            System.out.println("второе число нечетное");
        }
    }
}
