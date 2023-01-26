package lesson6;

import java.util.List;
import java.util.Map;

public class WordCounterDemo {

    public static void main(String[] args) throws Exception {
     //   String text = "text. text, text,, a. c. b, a,a,b";
        String text ="   Hello, sss,";

        WordCounter wordCounter = new WordCounter();
        List<String> words = wordCounter.splitIntoWords(text);
        Map<String, Integer> wordCount = wordCounter.wordsCount(words);

        System.out.println(wordCount);
    }
}
