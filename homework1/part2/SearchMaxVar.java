package homework1.part2;

import util.UserInput;

public class SearchMaxVar {
    public static void main(String[] args) {


        int a = UserInput.getUserInputInt("Введите первое число");
        int b = UserInput.getUserInputInt("Введите второе число");
        int c = UserInput.getUserInputInt("Введите третье число");

        if (a == b || b == c || a == c) {
            System.out.println("Некоторые числа равны");
        } else {
            System.out.println("Наибольшее число=" + findMaxVar(a, b, c));
        }

    }

    public static int findMaxVar(int a, int b, int c) {
        int m;
        if (a > b) {
            m = a;
        } else {
            m = b;
        }
        if (m < c) {
            m = c;
        }
        return m;
    }
}


