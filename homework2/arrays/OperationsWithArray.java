package homework2.arrays;

import java.util.Arrays;

public class OperationsWithArray {
    private static final int[] container = CreatorOfRandomArray.randomArray(5, 15);

    public static void main(String[] args) {
        System.out.println(Arrays.toString(container));
        System.out.println("Sum of the even positive elements:" + sumEvenPositiveElements(container));
        System.out.println("Max element with even index:" + findMaxElementWithEvenIndex(container));
        System.out.println("Elements less arithmetic mean:" + Arrays.toString(findElementsLessAverage(container)));
        System.out.println("Two min elements:" + Arrays.toString(findTwoMinElements(container)));
        System.out.println("Reduction array:" + Arrays.toString(reduceArray(container, 3, 5)));
        System.out.println("Summa of numbers of elements:" + sumOfNumbersOfElements(container));
    }

    public static int sumEvenPositiveElements(int[] array) {
        int summaOfElements = 0;
        for (int element : array) {
            if (element % 2 == 0 && element > 0) {
                summaOfElements += element;
            }
        }
        return summaOfElements;
    }

    public static int findMaxElementWithEvenIndex(int[] array) {
        int maxElement = array[0];
        for (int i = 0; i < array.length; ) {
            if (array[i] > maxElement) {
                maxElement = array[i];
            }
            i += 2;
        }
        return maxElement;
    }

    public static int[] findElementsLessAverage(int[] array) {
        float summaOfElements = 0.0f;
        for (int element : array) {
            summaOfElements += element;
        }
        float arithmeticMean = summaOfElements / array.length;
        int count = 0;
        for (int element : array) {
            if (element < arithmeticMean) {
                count++;
            }
        }
        int[] maxElements = new int[count];
        count = 0;
        for (int element : array) {
            if (element < arithmeticMean) {
                maxElements[count] = element;
                count++;
            }
        }
        return maxElements;
    }

    static public int[] findTwoMinElements(int[] array) {
        int minOne = array[0];
        int minTwo = array[1];
        if (minOne > minTwo) {
            minOne = array[1];
            minTwo = array[0];
        }
        for (int i = 2; i < array.length; i++) {
            if (array[i] < minOne) {
                int temp = minOne;
                minOne = array[i];
                if (temp < minTwo) {
                    minTwo = temp;
                }
            } else if (array[i] < minTwo) {
                minTwo = array[i];
            }
        }
        int[] minArray = new int[2];
        minArray[0] = minOne;
        minArray[1] = minTwo;
        return minArray;
    }

    public static int[] reduceArray(int[] array, int min, int max) {
        int[] reducedArray = new int[array.length];
        if (min > max) {
            int temp = max;
            max = min;
            min = temp;
        }
        int count = 0;
        for (int element : array) {
            if (min > element || element > max) {
                reducedArray[count] = element;
                count++;
            }
        }
        return reducedArray;

    }

    public static int sumOfNumbersOfElements(int[] array) {
        int summa = 0;
        for (int element : array) {
            int temp = element;
            while (temp > 0) {
                summa += temp % 10;
                temp /= 10;
            }
        }
        return summa;
    }
}
