package homework2.arrays;

import homework1.UserInput;

public class CreatorOfArray {
    public static int[] arrayFromConsole() {
        int numberOfElements = UserInput.getUserInputInt("Enter length of array:");
        String strOfElements = UserInput.getUserInputString("Enter the array elements separated by , :");
        String[] strArray = strOfElements.split(",");
        int[] numArray = new int[numberOfElements];
        if (strArray.length > numberOfElements) {
            throw new RuntimeException("You have entered extra elements");
        } else {
            for (int i = 0; i < strArray.length; i++) {
                numArray[i] = Integer.parseInt(strArray[i]);
            }
        }
        return numArray;
    }
}
