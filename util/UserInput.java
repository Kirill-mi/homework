package util;

import java.util.Scanner;

/**
 * @author Kirill Mikhalochkin
 * Class of input informatiom from console
 */

public class UserInput {
    private final static Scanner SCANNER = new Scanner(System.in);
    private final static Scanner SCANNER_STRING = new Scanner(System.in);

    /**
     * @param messageToDisplay information for user
     * @return int var, which user input from console
     */
    public static int getUserInputInt(String messageToDisplay) {
        System.out.println(messageToDisplay);
        try {
            return SCANNER.nextInt();
        } catch (Exception ex) {
            System.out.println("Введено не целое число");
            throw new RuntimeException();
        }
    }

    /**
     * @param messageToDisplay information for user
     * @return String var, which user input from console
     */
    public static String getUserInputString(String messageToDisplay) {
        System.out.println(messageToDisplay);
        return SCANNER_STRING.nextLine();
    }

    /**
     * @param messageToDisplay information for user
     * @return int double, which user input from console
     */
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
