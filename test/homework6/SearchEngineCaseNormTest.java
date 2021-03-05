package test.homework6;

import homework6.RegExSearch;
import homework6.SearchEngineCaseNorm;

/**
 * homework6test
 * 05.03.2021
 * Mikhalochkin Kirill
 */
public class SearchEngineCaseNormTest extends SearchEngineBaseTest {
    public SearchEngineCaseNormTest() {
        super(new SearchEngineCaseNorm(new RegExSearch()));
    }
}
