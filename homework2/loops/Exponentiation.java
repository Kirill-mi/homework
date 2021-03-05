package homework2.loops;

public class Exponentiation {


    public double findExp(double number, int powerOfNumber) {
        double result = 1.0;
        if (powerOfNumber < 0) {
            throw new IllegalArgumentException("Степень должна быть положительной");
        } else {
            for (int i = 1; i <= powerOfNumber; i++) {
                result = result * number;
            }
            System.out.println(number + "^" + powerOfNumber + "=" + result);
        }
        return result;
    }
}
