package homework2.loops;

public class FactorialOfUserNumber {
    final static int NUMBER_CAUSING_OVERFLOW = 20;

    public boolean verifiedInput(String[] args) {
        int number = Integer.parseInt(args[0]);
        if (number < 0) {
            System.out.println("Введите положительное число");
            return false;
        }
        if (number >= NUMBER_CAUSING_OVERFLOW) {
            System.out.println("Введено слишком большое число");
            return false;
        } else {
            return true;
        }
    }

    public long findFactorial(int number) {
        long factorial = 1;
        if (number == 0 || number == 1) {
            return factorial;
        }
        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public long findRecursionFactorial(int number) {
        if (number == 1||number == 0) {
            return 1;
        }
        return number * findRecursionFactorial(number - 1);
    }
}
