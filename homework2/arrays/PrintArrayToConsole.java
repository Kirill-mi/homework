package homework2.arrays;


public class PrintArrayToConsole {
    private static final int[] container = CreatorOfArray.arrayFromConsole();

    public static void main(String[] args) {
        System.out.println("All elements of array:");
        printAllElements();
        System.out.println("\nEven position elements of array:");
        printEvenPositionElements();
        System.out.println("\nContrary elements of array:");
        printContraryElements();
    }

    private static void printAllElements() {
        for (int elementOfArray : container) {
            System.out.print(elementOfArray + " ");
        }
        System.out.println();
        for (int i = 0; i < container.length; i++) {
            System.out.print(container[i] + " ");
        }
        System.out.println();
        int i = 0;
        while (i < container.length) {
            System.out.print(container[i] + " ");
            i++;
        }
        System.out.println();
        i = 0;
        do {
            System.out.print(container[i] + " ");
            i++;
        } while (i < (container.length));

    }

    private static void printEvenPositionElements() {
        int count = 0;
        for (int elementOfArray : container) {
            if (count % 2 == 0) {
                System.out.print(elementOfArray + " ");
            }
            count++;
        }
        System.out.println();
        for (int c = 0; c < container.length; c++) {
            if (c % 2 == 0) {
                System.out.print(container[c] + " ");
            }
        }
        System.out.println();
        int i = 0;
        while (i < container.length) {
            System.out.print(container[i] + " ");
            i += 2;
        }
        System.out.println();
        i = 0;
        do {
            System.out.print(container[i] + " ");
            i += 2;
        } while (i < (container.length));
    }

    private static void printContraryElements() {
        int count = container.length - 1;
        int[] reverseArray = new int[container.length];
        for (int element : container) {
            reverseArray[count] = element;
            count--;
        }
        for (int reverseElement : reverseArray) {
            System.out.print(reverseElement + " ");
        }
        System.out.println();
        for (int i = container.length - 1; i >= 0; i--) {
            System.out.print(container[i] + " ");
        }
        System.out.println();
        int i = container.length - 1;
        while (i >= 0) {
            System.out.print(container[i] + " ");
            i--;
        }
        System.out.println();
        i = container.length - 1;
        do {
            System.out.print(container[i] + " ");
            i--;
        } while (i >= 0);
    }

}
