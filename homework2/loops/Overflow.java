package homework2.loops;

import homework1.UserInput;

public class Overflow {
    public static void main(String[] args) {
        long a = 1;
        int multiplier = UserInput.getUserInputInt("Введите целочисленный множитель:");
        while (Math.abs(a) <= Long.MAX_VALUE / Math.abs(multiplier)) {
            a *= multiplier;
        }
        System.out.println("Число до преполнения=" + a);
        System.out.println("Число после преполнения=" + (a * multiplier));
    }
}
