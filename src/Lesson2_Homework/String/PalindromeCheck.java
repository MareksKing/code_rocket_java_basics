package Lesson2_Homework.String;

import java.util.Scanner;

public class PalindromeCheck {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input text to check for palindrome: ");
        String palindromeCheck = input.nextLine();

        for (int i = 0; i < palindromeCheck.length(); i++) {
            if(palindromeCheck.charAt(i) != palindromeCheck.charAt(palindromeCheck.length()-(i+1))){
                System.out.println("Not a palindrome");
                break;
            }
            if(i == palindromeCheck.length()-1){
                System.out.println("Is a palindrome");
            }
        }
    }
}
