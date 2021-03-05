package homework2.loops;

public class ProductOfDigitsOfNumber {
    public int findProductOfNumbers(String[] args) {
        int number = 0;
        int multiply = 1;
        try {
            Float.parseFloat(args[0]);
        } catch (NumberFormatException ex) {
            throw new NumberFormatException("Введено не число");
        }
        try {
            number = Integer.parseInt(args[0]);
            int numberOfDigits = (args[0]).length();
            while (numberOfDigits > 1) {
                numberOfDigits--;
                int element = (int) (number / Math.pow(10.0, numberOfDigits));
                multiply *= element;
                System.out.print(element + "*");
                number %= 10 * Math.pow(10.0, numberOfDigits - 1);
            }
            System.out.println(number + "=" + number * multiply);
        } catch (NumberFormatException ex) {
            throw new NumberFormatException("Введено не целое число");

        }
        return number * multiply;
    }
}
