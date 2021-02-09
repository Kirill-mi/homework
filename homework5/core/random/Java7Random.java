package homework5.core.random;

import homework5.core.random.api.IRandom;

import java.util.Random;

/**
 * homework5
 * 05.02.2021
 * Mikhalochkin Kirill
 */
public class Java7Random implements IRandom {
    Random rand = new Random();

    @Override
    public int randInt(int min, int max) {
        return (rand.nextInt(max - min) + min);
    }

    @Override
    public double randDouble(double min, double max) {
        double result = rand.nextDouble() * (max - min) + min;
        double scale = Math.pow(10, 2);
        return Math.round(result * scale) / scale;

    }

    @Override
    public String randString(int min, int max) {
        StringBuilder sb = new StringBuilder();
        String lowLetter = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        String upLetter = "АБВГДЕЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
        sb.append(upLetter.charAt(rand.nextInt(upLetter.length())));
        for (int i = 1; i < randInt(min, max); i++) {
            sb.append(lowLetter.charAt(rand.nextInt(lowLetter.length())));
        }
        return sb.toString();
    }

    @Override
    public boolean randBoolean() {
        return rand.nextBoolean();
    }
}
