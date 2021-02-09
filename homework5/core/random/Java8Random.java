package homework5.core.random;

import homework5.core.random.api.IRandom;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/**
 * homework5
 * 08.02.2021
 * Mikhalochkin Kirill
 */
public class Java8Random implements IRandom {
    private final ArrayList<String> names = new ArrayList<>();

    public Java8Random() {
        try (BufferedReader bufReader = new BufferedReader(new FileReader(
                "C:\\Users\\Кирилл\\IdeaProjects\\Academy\\JD1\\homework\\homework5\\Names"))) {
            String line = bufReader.readLine();
            while (line != null) {
                names.add(line);
                line = bufReader.readLine();
            }
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    public int randInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    @Override
    public double randDouble(double min, double max) {
        double result = ThreadLocalRandom.current().nextDouble(min, max);
        double scale = Math.pow(10, 2);
        return Math.round(result * scale) / scale;
    }

    @Override
    public String randString(int min, int max) {
        boolean flag = true;
        String name;
        do {
            name = names.get(ThreadLocalRandom.current().nextInt(names.size()));
            if (name.length() > min && name.length() < max) {
                flag = false;
            }
        } while (flag);
        return name;
    }


    @Override
    public boolean randBoolean() {
        return ThreadLocalRandom.current().nextBoolean();
    }
}
