package Lesson2_Homework.String;

import java.util.Scanner;

public class StringWordReplacement {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input the sentence you want to replace: ");
        String originalString = input.nextLine();

        String[] originalWords = originalString.split("\\s+");
        System.out.print("Input the word you want to replace: ");
        String wordToReplace = input.nextLine();

        System.out.print("Input the word you to replace it with: ");
        String replacementWord = input.nextLine();
        for (String word: originalWords) {
            word = word.replaceAll(wordToReplace, replacementWord);
            System.out.print( word + " ");
        }

    }
}
