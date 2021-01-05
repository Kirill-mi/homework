package homeWork1;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введи число [-128;127]: ");
        byte number = in.nextByte();
        String result = toBinaryString(number);
        System.out.println("Двоичный код:" + result);
    }

    static String toBinaryString(byte numberDec) {
        String numberBin;
        if (numberDec >= 0) {
            numberBin = String.format("%8s", Integer.toBinaryString(numberDec)).
                    replaceAll(" ", "0");
            return numberBin;
        } else {
            numberBin = Integer.toBinaryString(numberDec).substring(24);
            return numberBin;
        }
    }
}
