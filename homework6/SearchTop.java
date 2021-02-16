package homework6;

import util.UserInput;

import java.util.*;

/**
 * homework6
 * 12.02.2021
 * Mikhalochkin Kirill
 */
public class SearchTop {

    private final Map<String, Integer> numberOfWords = new HashMap<>();

    public void search(String text) {
        Set<String> sortText = new HashSet<>();
        text = text.replaceAll("\\p{Punct}", "");
        text = text.replaceAll("\\s+", " ");
        String[] wordsArray = (text.split(" "));
        Collections.addAll(sortText, wordsArray);
        System.out.println(" В книге использовано " + sortText.size() + " слов");

        for (String key : wordsArray) {
            if (numberOfWords.containsKey(key)) {
                Integer buffer = numberOfWords.remove(key);
                buffer++;
                numberOfWords.put(key, buffer);
            } else {
                numberOfWords.put(key, 1);
            }
        }
        ArrayList<Integer> number = new ArrayList<>(numberOfWords.values());
        number.sort(Integer::compareTo);
        Collections.reverse(number);
        List<Map.Entry<String, Integer>> topWords = new ArrayList<>(numberOfWords.entrySet());
        topWords.sort(new Comparator<>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return (-1) * o1.getValue().compareTo(o2.getValue());
            }

            @Override
            public boolean equals(Object obj) {
                return false;
            }
        });
        int numberWordsToPrint = UserInput.getUserInputInt("Количество слов из топ для вывода:");
        for (int i = 0; i < numberWordsToPrint; i++) {
            System.out.println(topWords.get(i));
        }
    }
}
