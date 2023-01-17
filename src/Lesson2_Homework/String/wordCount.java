package Lesson2_Homework.String;

public class wordCount {

    public static void main(String[] args) {
        String string = new String("The quick brown fox jumps over the lazy dog.");
        System.out.println("The number of words in the string: " + string.split("\\s+").length);
    }
}
