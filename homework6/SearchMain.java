package homework6;

import homework6.api.ISearchEngine;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * homework6
 * 12.02.2021
 * Mikhalochkin Kirill
 */
public class SearchMain {


    public static void main(String[] args) {
        SearchTop searchTop = new SearchTop();
        ISearchEngine easySearch = new EasySearch();
        ISearchEngine regSearch = new SearchEngineCaseNorm(new SearchEnginePunctuationNormalizer(new RegExSearch()));
        String text = null;
        try {
            text = Files.readString(Path.of(
                    "C:\\Users\\Кирилл\\IdeaProjects\\Academy\\JD1\\homework\\homework6\\Война и мир_книга.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        searchTop.search(text);
        System.out.println("Слово война встречается " + regSearch.search(text, "война") + " раз");
        System.out.println("Слово и встречается " + regSearch.search(text, "и") + " раз");
        System.out.println("Слово мир встречается " + regSearch.search(text, "мир") + " раз");
    }
}
