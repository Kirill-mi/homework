package homework6;

import homework6.api.ISearchEngine;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


/**
 * homework6
 * 03.03.2021
 * Mikhalochkin Kirill
 */
public class SearchResultInThread extends SearchResultInFile {
    public static void main(String[] args) {
        String addressOfDirectory = "C:\\Users\\Кирилл\\Downloads\\books";
        ISearchEngine regSearch = new SearchEngineCaseNorm(new SearchEnginePunctuationNormalizer(new RegExSearch()));
        StringBuilder bookAddress = new StringBuilder();
        StringBuilder book = new StringBuilder();
        FileWriter writer=null;
        try {
             writer = new FileWriter(new File("result.txt"));
            do {
                bookAddress.append(getBookAddress(addressOfDirectory));
                if (bookAddress.toString().equals("end")) {
                    return;
                } else {
                    FileWriter finalWriter = writer;
                    Thread th = new Thread(() -> {
                        book.append(readBookToString(bookAddress.toString()));
                        String resultOfSearch = (getResultOfSearch(book.toString(), bookAddress.toString(), regSearch));
                        saveResult(resultOfSearch, finalWriter);
                        book.setLength(0);
                        bookAddress.setLength(0);
                    });
                    th.start();
                    try {
                        TimeUnit.MILLISECONDS.sleep(10000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            } while (!bookAddress.toString().equals("end"));
        } catch (IOException e) {
            e.printStackTrace();
        }finally {if (writer!=null) {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        }
    }
}
