package homework1;

import java.util.Scanner;
import java.util.Objects;

public class Task51 {
    public static void main(String[] args) {
        String nameOne = "Вася";
        String nameTwo = "Анастасия";
        Scanner in = new Scanner(System.in);
        System.out.print("Введи имя: ");
        String name = in.nextLine();

        if (Objects.equals(name, nameOne)) {
            System.out.println("Привет!\nЯ тебя так долго ждал");
        } else {
            if (Objects.equals(name, nameTwo)) {
                System.out.println("Я тебя так долго ждал");
            } else {
                System.out.println("Добрый день. А вы кто?");
            }
        }
    }
}
