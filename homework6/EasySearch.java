package homework6;

import homework6.api.ISearchEngine;

/**
 * homework6
 * 13.02.2021
 * Mikhalochkin Kirill
 */
public class EasySearch implements ISearchEngine {

    @Override
    public long search(String text, String word) {
        int startIndex = 0;
        text += " ";
        int count = 0;
        int temp = 0;
        while (temp != -1) {
            temp = text.indexOf(word, startIndex);
            if (temp != -1) {
                startIndex = text.indexOf(word, startIndex) + word.length();
                if (text.charAt(temp - 1) == ' ' && text.charAt(temp + word.length()) == ' ') {
                    count++;
                }
            }
        }
        return count;
    }
}
