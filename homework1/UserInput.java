package homework1;

import java.util.Scanner;

public class UserInput {
    private final static Scanner SCANNER = new Scanner(System.in);
    private final static Scanner SCANNER_STRING = new Scanner(System.in);

    public static int getUserInputInt(String messageToDisplay) {
        System.out.println(messageToDisplay);
        try {
            return SCANNER.nextInt();
        } catch (Exception ex) {
            System.out.println("Введено не целое число");
            throw new RuntimeException();
        }
    }

    public static String getUserInputString(String messageToDisplay) {
        System.out.println(messageToDisplay);
        return SCANNER_STRING.nextLine();
    }

    public static double getUserInputDouble(String messageToDisplay) {
        System.out.println(messageToDisplay);
        try {
            return SCANNER.nextDouble();
        } catch (Exception ex) {
            System.out.println("Введено не число");
            throw new RuntimeException();
        }
    }
}
