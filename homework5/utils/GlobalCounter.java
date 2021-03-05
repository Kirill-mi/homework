package homework5.utils;

/**
 * homework5
 * 06.02.2021
 * Mikhalochkin Kirill
 */
public class GlobalCounter {
    private int counter;

    public int get() {
        return this.counter;
    }

    public int getAndInc() {
        return this.counter++;
    }
}
