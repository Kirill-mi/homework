package homework1;

import java.util.Scanner;

public class Task6 {
    public static String createPhoneNumber(Integer[] numbers) {
        String phoneNumber = String.format("(%d%d%d) %d%d%d-%d%d%d%d",(Object[]) numbers);
        return phoneNumber;
    }

    public static void main(String[] args) {
        Integer[] numbers = new Integer[10];
        Scanner in = new Scanner(System.in);
        System.out.print("Введите цифру номера:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = in.nextInt();
            System.out.print("Введите цифру номера:");
        }
        String formatNumber = createPhoneNumber(numbers);
        System.out.println(formatNumber);
    }
}

