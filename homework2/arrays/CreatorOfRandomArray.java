package homework2.arrays;

//import util.UserInput;

import java.util.Arrays;

public class CreatorOfRandomArray {
    public static void main(String[] args) {
        int[] array = randomArray(5, 100);
        System.out.println(Arrays.toString(array));
    }

    public static int[] randomArray(int size, int maxValueExclusion) {
//        size= UserInput.getUserInputInt("");
//        maxValueExclusion=UserInput.getUserInputInt("");
        int[] container = new int[size];
        for (int i = 0; i < size; i++) {
            container[i] = (int) (Math.random() * maxValueExclusion);
        }
        return container;
    }
}
