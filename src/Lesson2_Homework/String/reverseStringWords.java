package Lesson2_Homework.String;

import java.util.Scanner;

public class reverseStringWords {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input a string to be reversed: ");
        String reversableString = input.nextLine();
        String[] stringWords = reversableString.split("[\\s ,.]+");
        int[] delimiters= new int[stringWords.length];
        for (int i = 0; i < stringWords.length; i++) {
            for (int j = 0; j < reversableString.length(); j++) {
                if(reversableString.charAt(j) == '.' || reversableString.charAt(j) == ' ' || reversableString.charAt(j) == ','){
                    delimiters[i] = j;
                    i++;
                }

            }
        }

        String reversedString = new String();
        int delimiter = 0;
        for (String string : stringWords) {
            String newString = new String();
            for (int i = string.length()-1; i >= 0; i--) {

                newString += string.charAt(i);
                if(i == 0){
                    newString += reversableString.charAt(delimiters[delimiter]);

                    delimiter++;
                }
            }
            reversedString += newString;
        }

        System.out.println(reversedString);



    }
}
