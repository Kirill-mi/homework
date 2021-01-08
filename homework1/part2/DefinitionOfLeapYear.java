package homework1.part2;

import homework1.UserInput;

public class DefinitionOfLeapYear {
    public static void main(String[] args) {
        int numberOfYear = UserInput.getUserInputInt("Введит год:");
        if (numberOfYear % 4 != 0) {
            System.out.println("Год обычный");
        } else if (numberOfYear % 100 == 0 && numberOfYear % 400 != 0) {
            System.out.println("Год обычный");
        } else {
            System.out.println("Год високосный");
        }
    }
}
