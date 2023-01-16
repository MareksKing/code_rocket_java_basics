package Lesson2_Homework.String;

import java.util.Scanner;

public class PalindromeReplace {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input a string to replace the palindromes in: ");
        String inputString = input.nextLine();
        String[] words = inputString.split("\\s+");


        for (String word : words) {

            if(isPalindrome(word)){
                for (int i = 0; i < word.length(); i++) {
                    word = word.replace(word.charAt(i), '*');
                }

            }

            System.out.print(word + " ");


        }


    }

    public static boolean isPalindrome(String word){
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) != word.charAt(word.length()-(i+1))){
                return false;
            }
        }
        if(word.length() == 1){
            return false;
        }
        return true;
    }
}
