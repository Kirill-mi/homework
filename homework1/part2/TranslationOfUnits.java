package homework1.part2;

import util.UserInput;

import java.util.Objects;


public class TranslationOfUnits {
    public static void main(String[] args) {
        int unit = UserInput.getUserInputInt("Введите число байт(килобайт):");
        String wayOfTranslation = UserInput.getUserInputString("Направление перевода K(байт в килобайт)" +
                " B(килобайт в байт) :");

        if (Objects.equals(wayOfTranslation, "K")) {
            int translationUnit = unit / 1024;
            System.out.println(unit + "Б=" + translationUnit + "Кб");
        } else if (Objects.equals(wayOfTranslation, "B")) {
            int translationUnit = unit * 1024;
            System.out.println(unit + "Кб=" + translationUnit + "Б");
        } else {
            System.out.println("Корректно введите данные");
        }
    }
}


