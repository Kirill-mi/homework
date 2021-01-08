package homework1;

import java.util.Scanner;

public class UserInput {
    private static Scanner scanner = new Scanner(System.in);
    private static Scanner scannerString = new Scanner(System.in);

    public static int getUserInputInt(String messageToDisplay) {
        System.out.println(messageToDisplay);
        return scanner.nextInt();
    }
    public static String getUserInputString(String messageToDisplay) {
        System.out.println(messageToDisplay);
        return scannerString.nextLine();
    }
    }



