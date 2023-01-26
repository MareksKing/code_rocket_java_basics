package lesson6;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCounterTest {

    public static void main(String[] args) throws Exception {
        normalTextTest();
        emptyTextTest();
        oneSpaceTextTest();
        punctuationAtTheBeginningTextTest();
        sameWordMultipleTimesTextTest();
        multiplePuntuationsTextTest();
        numberTextTest();
        numberWordMixedTextTest();
        singleCharacterTextTest();
        multipleWhitespacesTextTest();
    }

    public static void normalTextTest(){
        WordCounter wordCounter = new WordCounter();
        String text = "Hello, I am Mareks Robalds and I learn Computer Science!";
        List<String> words =wordCounter.splitIntoWords(text);
        Map<String, Integer> wordCount = wordCounter.wordsCount(words);
        Map<String, Integer> expectedResult = new HashMap<>();

        expectedResult.put("Hello", 1);
        expectedResult.put("I", 2);
        expectedResult.put("am", 1);
        expectedResult.put("Mareks", 1);
        expectedResult.put("Robalds", 1);
        expectedResult.put("and", 1);
        expectedResult.put("learn", 1);
        expectedResult.put("Computer", 1);
        expectedResult.put("Science", 1);

        if(wordCount.equals(expectedResult)){
            System.out.println("normalTextTest: PASSED" + expectedResult + " " + wordCount);
        }else{
            System.err.println("normalTextTest: FAILED" + expectedResult + " " + wordCount);
        }

    }
    public static void emptyTextTest(){
        WordCounter wordCounter = new WordCounter();
        String text = "";
        List<String> words =wordCounter.splitIntoWords(text);
        Map<String, Integer> wordCount = wordCounter.wordsCount(words);



        if(wordCount.isEmpty()){
            System.out.println("emptyTextTest: PASSED"  + " " + wordCount);
        }else{
            System.err.println("emptyTextTest: FAILED" + " " + wordCount);
        }


    }
    public static void oneSpaceTextTest(){
        WordCounter wordCounter = new WordCounter();
        String text = " ";
        List<String> words =wordCounter.splitIntoWords(text);
        Map<String, Integer> wordCount = wordCounter.wordsCount(words);


        if(wordCount.isEmpty()){
            System.out.println("oneSpaceTextTest: PASSED expected Empty got:" + " " + wordCount);
        }else{
            System.err.println("oneSpaceTextTest: FAILED expected Empty got:"+ " " + wordCount);
        }

    }
    public static void punctuationAtTheBeginningTextTest(){
        WordCounter wordCounter = new WordCounter();
        String text = ",,, hello I am Mareks ";
        List<String> words =wordCounter.splitIntoWords(text);
        Map<String, Integer> wordCount = wordCounter.wordsCount(words);
        Map<String, Integer> expectedResult = new HashMap<>();

        expectedResult.put("hello", 1);
        expectedResult.put("I", 1);
        expectedResult.put("am", 1);
        expectedResult.put("Mareks", 1);


        if(wordCount.equals(expectedResult)){
            System.out.println("punctuationAtTheBeginningTextTest: PASSED" + expectedResult + " " + wordCount);
        }else{
            System.err.println("punctuationAtTheBeginningTextTest: FAILED" + expectedResult + " " + wordCount);
        }

    }

    public static void sameWordMultipleTimesTextTest(){
        WordCounter wordCounter = new WordCounter();
        String text = "test test test";
        List<String> words =wordCounter.splitIntoWords(text);
        Map<String, Integer> wordCount = wordCounter.wordsCount(words);
        Map<String, Integer> expectedResult = new HashMap<>();

        expectedResult.put("test", 3);

        if(wordCount.equals(expectedResult)){
            System.out.println("sameWordMultipleTimesTextTest: PASSED" + expectedResult + " " + wordCount);
        }else{
            System.err.println("sameWordMultipleTimesTextTest: FAILED" + expectedResult + " " + wordCount);
        }

    }
    public static void multiplePuntuationsTextTest(){
        WordCounter wordCounter = new WordCounter();
        String text = "test,,,  test,,  test ,,";
        List<String> words =wordCounter.splitIntoWords(text);
        Map<String, Integer> wordCount = wordCounter.wordsCount(words);
        Map<String, Integer> expectedResult = new HashMap<>();

        expectedResult.put("test", 3);

        if(wordCount.equals(expectedResult)){
            System.out.println("multiplePuntuationsTextTest: PASSED" + expectedResult + " " + wordCount);
        }else{
            System.err.println("multiplePuntuationsTextTest: FAILED" + expectedResult + " " + wordCount);
        }

    }
    public static void numberTextTest(){
        WordCounter wordCounter = new WordCounter();
        String text = "1.2345.678.900";
        List<String> words =wordCounter.splitIntoWords(text);
        Map<String, Integer> wordCount = wordCounter.wordsCount(words);
        Map<String, Integer> expectedResult = new HashMap<>();

        expectedResult.put("1", 1);
        expectedResult.put("2345", 1);
        expectedResult.put("678", 1);
        expectedResult.put("900", 1);

        if(wordCount.equals(expectedResult)){
            System.out.println("numberTextTest: PASSED" + expectedResult + " " + wordCount);
        }else{
            System.err.println("numberTextTest: FAILED" + expectedResult + " " + wordCount);
        }

    }
    public static void numberWordMixedTextTest(){
        WordCounter wordCounter = new WordCounter();
        String text = "test.12 test312 test212, 222";
        List<String> words =wordCounter.splitIntoWords(text);
        Map<String, Integer> wordCount = wordCounter.wordsCount(words);
        Map<String, Integer> expectedResult = new HashMap<>();

        expectedResult.put("test", 1);
        expectedResult.put("12", 1);
        expectedResult.put("test312", 1);
        expectedResult.put("test212", 1);
        expectedResult.put("222", 1);

        if(wordCount.equals(expectedResult)){
            System.out.println("numberWordMixedTextTest: PASSED" + expectedResult + " " + wordCount);
        }else{
            System.err.println("numberWordMixedTextTest: FAILED" + expectedResult + " " + wordCount);
        }

    }
    public static void singleCharacterTextTest(){
        WordCounter wordCounter = new WordCounter();
        String text = "t";
        List<String> words =wordCounter.splitIntoWords(text);
        Map<String, Integer> wordCount = wordCounter.wordsCount(words);
        Map<String, Integer> expectedResult = new HashMap<>();

        expectedResult.put("t", 1);


        if(wordCount.equals(expectedResult)){
            System.out.println("singleCharacterTextTest: PASSED" + expectedResult + " " + wordCount);
        }else{
            System.err.println("singleCharacterTextTest: FAILED" + expectedResult + " " + wordCount);
        }

    }

    public static void multipleWhitespacesTextTest(){
        WordCounter wordCounter = new WordCounter();
        String text = "This   is        a       test";
        List<String> words =wordCounter.splitIntoWords(text);
        Map<String, Integer> wordCount = wordCounter.wordsCount(words);
        Map<String, Integer> expectedResult = new HashMap<>();

        expectedResult.put("This", 1);
        expectedResult.put("is", 1);
        expectedResult.put("a", 1);
        expectedResult.put("test", 1);


        if(wordCount.equals(expectedResult)){
            System.out.println("multipleWhitespacesTextTest: PASSED" + expectedResult + " " + wordCount);
        }else{
            System.err.println("multipleWhitespacesTextTest: FAILED" + expectedResult + " " + wordCount);
        }

    }


}
