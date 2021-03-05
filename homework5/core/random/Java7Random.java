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

    /**
     * Returns a pseudo-random number int from the range(min,max)
     *
     * @param min the least value, unless greater than bound
     * @param max the upper bound (exclusive)
     * @return a pseudorandom value
     */
    @Override
    public int randInt(int min, int max) {
        return (rand.nextInt((max - min)+1) + min);
    }

    /**
     * Returns a pseudo-random number double from the range(min,max) rounded to tenths
     *
     * @param min the least value, unless greater than bound
     * @param max the upper bound (exclusive)
     * @return a pseudorandom value
     */
    @Override
    public double randDouble(double min, double max) {
        double result = rand.nextDouble() * (max - min) + min;
        double scale = Math.pow(10, 1);
        return Math.round(result * scale) / scale;

    }

    /**
     * Returns a pseudo-random String with length of the interval(min,max)
     *
     * @param min minimum string length
     * @param max maximum string length
     * @return a pseudorandom value
     */
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

    /**
     * Returns a pseudo-random
     *
     * @return a pseudorandom value boolean
     */
    @Override
    public boolean randBoolean() {
        return rand.nextBoolean();
    }
}
