package homework1.part2;

import homework1.UserInput;

public class DefinitionOfSymbol {
    public static void main(String[] args) {
        int numberOfSymbol = UserInput.getUserInputInt("Введите код символа в кодировке ASCII:");

        if (numberOfSymbol >= 'A' && numberOfSymbol <= 'Z' || numberOfSymbol >= 'a' && numberOfSymbol <= 'z') {
            System.out.println("Введена буква " + (char) numberOfSymbol);
        } else {
            System.out.println("Введен символ " + (char) numberOfSymbol);
        }

    }
}
