package homework6;

import homework6.api.ISearchEngine;

import java.util.regex.Pattern;

/**
 * homework6
 * 14.02.2021
 * Mikhalochkin Kirill
 */
public class SearchEngineCaseNorm implements ISearchEngine {
    private final ISearchEngine finder;

    public SearchEngineCaseNorm(ISearchEngine finder) {
        this.finder = finder;
    }

    @Override
    public long search(String text, String word) {

        if (finder instanceof RegExSearch) {
            ((RegExSearch) finder).setFlag(Pattern.CASE_INSENSITIVE);
        } else {
            text = text.toLowerCase();
            word = word.toLowerCase();
        }
        return finder.search(text, word);
    }
}