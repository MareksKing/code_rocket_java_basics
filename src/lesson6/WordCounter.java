package lesson6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCounter {

    public List<String> splitIntoWords(String text){



        String correctedText = text.replaceAll("[^A-Za-z0-9]+", " ");
        correctedText = correctedText.strip();
        String[] words = correctedText.split("\\s+");
        if(correctedText.isEmpty()){
            return List.of();
        }
        return Arrays.asList(words);
    }

    public Map<String, Integer> wordsCount(List<String> words) {
        HashMap<String, Integer> wordsMap = new HashMap<>();
        for (String word : words) {
            if (wordsMap.containsKey(word)) {
                Integer count = wordsMap.get(word);
                count++;
                wordsMap.put(word, count);
            } else {
                wordsMap.put(word, 1);
            }
        }
        return wordsMap;
    }
}
