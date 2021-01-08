package homework1.part2;

import homework1.UserInput;

public class TestOfDivisibility {
    public static void main(String[] args) {
        int divisible = UserInput.getUserInputInt("Введите делимое:");
        int divider = UserInput.getUserInputInt("Введите делитель:");
        if (divisible % divider == 0) {
            System.out.println(divisible + " делится на " + divider);
        } else {
            System.out.println(divisible + "  не делится на " + divider);
            System.out.println("Остаток:" + divisible % divider);
        }
        System.out.println("Частное:" + divisible / divider);
    }
}
