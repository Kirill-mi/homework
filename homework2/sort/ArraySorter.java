package homework2.sort;

public class ArraySorter {

    public static int[] bubbleSort(int[] array) {
        boolean isSorted = false;
        int count = array.length;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < count; i++) {
                if (array[i - 1] > array[i]) {
                    changeElements(array, i);
                    isSorted = false;
                }
            }
            count--;
        }
        return array;
    }

    public static int[] shakeSort(int[] array) {
        boolean isSorted = false;
        int countUp = array.length;
        int countDown = 0;
        while (!isSorted) {
            for (int i = 1; i < countUp; i++) {
                if (array[i - 1] > array[i]) {
                    changeElements(array, i);
                }
            }
            countUp--;
            isSorted = true;
            for (int i = countUp; i > countDown; i--) {
                if (array[i] < array[i - 1]) {
                    changeElements(array, i);
                    isSorted = false;
                }
            }
            countDown++;
        }
        return array;
    }

    private static void changeElements(int[] array, int i) {
        int temp;
        temp = array[i - 1];
        array[i - 1] = array[i];
        array[i] = temp;
    }
}
