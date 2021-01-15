package homework2.sort;

import homework2.arrays.CreatorOfArray;
import homework2.arrays.CreatorOfRandomArray;

import java.util.Arrays;

public class TestOfTwoSorts {
    public static void main(String[] args) {
        int[][] testArray = new int[6][];
        testArray[0] = new int[]{1, 2, 3, 4, 5, 6};
        testArray[1] = new int[]{1, 1, 1, 1};
        testArray[2] = new int[]{9, 1, 5, 99, 9, 9};
        testArray[3] = new int[]{};
        testArray[4] = CreatorOfRandomArray.randomArray(5, 10);
        testArray[5] = CreatorOfArray.arrayFromConsole();
        for (int[] elements : testArray) {
            System.out.println("Before sort:"+Arrays.toString(elements));
            System.out.println("After bubble sort:"+Arrays.toString(ArraySorter.bubbleSort(elements)));
            System.out.println("After shake sort:"+Arrays.toString(ArraySorter.shakeSort(elements)));
        }
    }
}
