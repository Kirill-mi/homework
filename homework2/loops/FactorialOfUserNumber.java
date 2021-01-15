package homework2.loops;

public class FactorialOfUserNumber {
    final static int NUMBER_CAUSING_OVERFLOW = 20;

    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        long factorial = 1;
        long factorialRecursion = 1;
        if (number < 0) {
            System.out.println("Введите положительное число");
            return;
        }
        if (number >= NUMBER_CAUSING_OVERFLOW) {
            System.out.println("Введено слишком большое число");
            return;
        }
        if (number == 0 || number == 1) {
            System.out.println("Ответ :" + factorial);
            return;
        }
        System.out.print(factorial);
        for (int i = 2; i <= number; i++) {
            factorial *= i;
            System.out.print("*" + i);
        }
        System.out.println("=" + factorial);
        System.out.print("Расчет реурсией:" + factorialRecursion);
        for (int i = 2; i <= number; i++) {
            System.out.print("*" + i);
        }
        System.out.print("=" + findRecursionFactorial(number));
    }

    private static long findRecursionFactorial(int number) {
        if (number == 1) {
            return 1;
        }
        return number * findRecursionFactorial(number - 1);
    }
}
