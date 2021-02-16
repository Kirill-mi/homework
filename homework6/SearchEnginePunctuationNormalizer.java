package homework6;

import homework6.api.ISearchEngine;

/**
 * homework6
 * 14.02.2021
 * Mikhalochkin Kirill
 */
public class SearchEnginePunctuationNormalizer implements ISearchEngine {
    public final ISearchEngine finder;

    public SearchEnginePunctuationNormalizer(ISearchEngine finder) {
        this.finder = finder;
    }

    @Override
    public long search(String text, String word) {
        text = text.replaceAll("\\p{Punct}", "");
        text = text.replaceAll("\\s+", " ");
        return finder.search(text, word);
    }
}
