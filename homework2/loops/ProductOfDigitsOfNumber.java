package homework2.loops;

public class ProductOfDigitsOfNumber {
    public static void main(String[] args) {
        try {
            Float.parseFloat(args[0]);
            try {
                int number = Integer.parseInt(args[0]);
                int numberOfDigits = (args[0]).length();
                int multiply = 1;
                while (numberOfDigits > 1) {
                    numberOfDigits--;
                    int element = (int) (number / Math.pow(10.0, numberOfDigits));
                    multiply *= element;
                    System.out.print(element + "*");
                    number %= 10 * Math.pow(10.0, numberOfDigits - 1);
                }
                System.out.println(number + "=" + number * multiply);
            } catch (Exception ex) {
                System.out.println("Введено не целое число");
            }
        } catch (Exception ex) {
            System.out.println("Введено не число");
        }
    }
}
