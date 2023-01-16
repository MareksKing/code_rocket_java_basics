package Lesson2_Homework.String;

import java.util.Scanner;

public class PalindromeReplace {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input a string to replace the palindromes in: ");
        String inputString = input.nextLine();
        String[] words = inputString.split("\\s+");


        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                if(word.charAt(i) != word.charAt(word.length()-(i+1))){
                    System.out.println(word + " is not a palindrome");

                    break;
                }
                if(word.length() == 1){
                    System.out.println(word + " is not a palindrome");

                    break;
                }

                word.replace(word.charAt(i), '*');


            }
        }


    }
}
