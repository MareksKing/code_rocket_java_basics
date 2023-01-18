package Lesson2_Homework;

import java.util.Scanner;

public class Task48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a string: ");
        String string = scanner.nextLine();
        int vowelCount = 0;
        char[] charArray = string.toLowerCase().toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            switch (charArray[i]){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowelCount++;

            }
        }
        if(vowelCount == charArray.length){
            System.out.println("All characters in string are vowels");
        }else{
            System.out.println("Not all characters in the string are vowels");
        }
    }
}
