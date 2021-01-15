package homework2.loops;

public class MultiplicationTable {
    public static void main(String[] args) {
        createTable(2, 5);
        System.out.println("________________________________________");
        createTable(6, 9);
    }

    private static void createTable(int firstElement, int lastElement) {
        for (int i = 1; i <= 10; i++) {
            for (int j = firstElement; j <= lastElement; j++) {
                if (j != lastElement) {
                    System.out.printf("%dx%2d=%2d  | ", j, i, (i * j));
                } else {
                    System.out.printf("%dx%2d=%2d  ", j, i, (i * j));
                }
            }
            System.out.println();
        }
    }
}
