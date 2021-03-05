package homework2.arrays;


public class OperationsWithArray {

    public int sumEvenPositiveElements(int[] array) {
        int summaOfElements = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0 && array[i] > 0) {
                summaOfElements += array[i];
            }
        }
        return summaOfElements;
    }

    public int findMaxElementWithEvenIndex(int[] array) {
        int maxElement = array[0];
        for (int i = 0; i < array.length; ) {
            if (array[i] > maxElement) {
                maxElement = array[i];
            }
            i += 2;
        }
        return maxElement;
    }

    public int[] findElementsLessAverage(int[] array) {
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

    public int[] findTwoMinElements(int[] array) {
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

    public int[] reduceArray(int[] array, int min, int max) {
        int count = 0;
        if (min > max) {
            int temp = max;
            max = min;
            min = temp;
        }
        for (int element : array) {
            if (min > element || element > max) {
                count++;
            }
        }
        int[] reducedArray = new int[count];
        count = 0;
        for (int element : array) {
            if (min > element || element > max) {
                reducedArray[count] = element;
                count++;
            }
        }
        return reducedArray;
    }

    public int sumOfNumbersOfElements(int[] array) {
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
