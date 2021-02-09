package homework5.utils;

import java.util.Comparator;
import java.util.List;

/**
 * homework5
 * 06.02.2021
 * Mikhalochkin Kirill
 */
public class SortStudent<T> {


    public static <T> List<T> bubbleSort(List<T> array, Comparator<T> comparator) {
        boolean isSorted = false;
        int lengthyArray = array.size();
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < lengthyArray - 1; i++) {
                T left = array.get(i - 1);
                T right = array.get(i);
                int compare = comparator.compare(left, right);
                if (compare > 0) {
                    array.set(i - 1, right);
                    array.set(i, left);
                    isSorted = false;
                }
            }
        }
        return array;
    }

    public static <T> void shakeSort(List<T> array, Comparator<T> comparator) {
        boolean isSorted = false;
        int countUp = array.size();
        int countDown = 0;
        while (!isSorted) {
            for (int i = 1; i < countUp; i++) {
                T left = array.get(i - 1);
                T right = array.get(i);
                int compare = comparator.compare(left, right);
                if (compare > 0) {
                    array.set(i - 1, right);
                    array.set(i, left);
                }
            }
            countUp--;
            isSorted = true;
            for (int i = countUp; i > countDown; i--) {
                T left = array.get(i - 1);
                T right = array.get(i);
                int compare = comparator.compare(left, right);
                if (compare < 0) {
                    array.set(i - 1, right);
                    array.set(i, left);
                    isSorted = false;
                }
            }
            countDown++;
        }
    }
}
