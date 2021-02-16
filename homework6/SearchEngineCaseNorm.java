package homework6;

import homework6.api.ISearchEngine;

/**
 * homework6
 * 14.02.2021
 * Mikhalochkin Kirill
 */
public class SearchEngineCaseNorm implements ISearchEngine {
    public final ISearchEngine finder;

    public SearchEngineCaseNorm(ISearchEngine finder) {
        this.finder = finder;
    }

    @Override
    public long search(String text, String word) {

        String tempText = text.toLowerCase();
        String tempWord = word.toLowerCase();
        return finder.search(tempText, tempWord);
    }
}
