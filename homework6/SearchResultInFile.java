package homework6;

import homework6.api.ISearchEngine;
import util.UserInput;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.MalformedInputException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * homework7
 * 03.03.2021
 * Mikhalochkin Kirill
 */
public class SearchResultInFile {

    public static void main(String[] args) {
        String addressOfDirectory = "C:\\Users\\Кирилл\\Downloads\\books";
        ISearchEngine regSearch = new SearchEngineCaseNorm(new SearchEnginePunctuationNormalizer(new RegExSearch()));
        String bookAddress = getBookAddress(addressOfDirectory);
        StringBuilder book = new StringBuilder();
        try (FileWriter writer = new FileWriter(new File("result.txt"))) {
            String resultOfSearch;
            while (!bookAddress.equals("end")) {
                book.append(readBookToString(bookAddress));
                resultOfSearch = getResultOfSearch(book.toString(), bookAddress, regSearch);
                saveResult(resultOfSearch, writer);
                bookAddress = getBookAddress(addressOfDirectory);
                book.setLength(0);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void saveResult(String resultOfSearch, FileWriter writer) {
        try {
            writer.write(resultOfSearch);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getResultOfSearch(String book, String bookAddress, ISearchEngine regSearch) {
        String wordToFind = UserInput.getUserInputString("Enter word to find:");
        return Path.of(bookAddress).getFileName() + "-" + wordToFind + "-" + regSearch.search(book, wordToFind)
                + System.lineSeparator();
    }

    public static String getBookAddress(String addressOfDirectory) {
        Path path = Path.of(addressOfDirectory);
        try (DirectoryStream<Path> files = Files.newDirectoryStream(path)) {
            for (Path paths : files)
                System.out.println(paths.getFileName());
        } catch (IOException e) {
            e.printStackTrace();
        }
        String bookName = UserInput.getUserInputString("Enter  book title or end:");
        if (!bookName.equalsIgnoreCase("end")) {
            return addressOfDirectory + "\\" + bookName;
        } else {
            return "end";
        }
    }

    public static String readBookToString(String bookAddress) {
        StringBuilder text = new StringBuilder();
        String result = "";
        try {
            List<String> lines = Files.readAllLines(Paths.get(bookAddress), Charset.defaultCharset());
            for (String li : lines) {
                text.append(li);
            }
            result = text.toString();
        } catch (
                MalformedInputException ex) {
            try {
                List<String> lines = Files.readAllLines(Paths.get(bookAddress), Charset.forName("windows-1251"));
                for (String li : lines) {
                    text.append(li);
                }
                result = text.toString();
            } catch (IOException exc) {
                exc.printStackTrace();
            }
        } catch (IOException exc) {
            exc.printStackTrace();
        }
        return result;
    }
}
