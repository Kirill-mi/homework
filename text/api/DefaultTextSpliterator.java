package text.api;

/**
 * TODO add description
 * 10.02.2021
 * Mikhalochkin Kirill
 */
public class DefaultTextSpliterator implements  ItextSpliterator{
    public String[] split(String text) {
        return text.split(" ");
}
}
