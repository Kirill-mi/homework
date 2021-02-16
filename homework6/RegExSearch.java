package homework6;

import homework6.api.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * homework6
 * 13.02.2021
 * Mikhalochkin Kirill
 */
public class RegExSearch implements ISearchEngine {

    @Override
    public long search(String text, String word) {

        Pattern pattern = Pattern.compile("\\b" + word + "\\b");
        Matcher matcher = pattern.matcher(text);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }
}
