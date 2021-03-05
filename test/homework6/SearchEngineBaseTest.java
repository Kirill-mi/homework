package test.homework6;

import homework6.api.ISearchEngine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * homework6test
 * 05.03.2021
 * Mikhalochkin Kirill
 */
public abstract class SearchEngineBaseTest {
    private final ISearchEngine search;

    public SearchEngineBaseTest(ISearchEngine search) {
        this.search = search;
    }

    @Test
    public void testSearch() {
        assertEquals(1, search.search("привет, как дела!", "привет"));
        assertEquals(1, search.search("привет,какдела!", "какдела"));
        assertEquals(1, search.search("как дела!.Что делаешь?", "Что"));
        assertEquals(1, search.search("Привет-привет", "Привет-привет"));
        assertEquals(2, search.search("привет -привет", "привет"));
        assertEquals(1, search.search("бабушка бабушке бабушку", "бабушке"));
    }
}
