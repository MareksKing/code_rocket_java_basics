package Lesson2_Homework.String;

import java.nio.charset.CharsetEncoder;
import java.util.HashMap;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input two string to be checked: ");
        String firstInputString = input.nextLine();
        String secondInputString = input.nextLine();

        HashMap<Character, Integer> firstStringChars = new HashMap<Character, Integer>();
        HashMap<Character, Integer> secondStringChars = new HashMap<Character, Integer>();

        for (char character: firstInputString.toUpperCase().toCharArray()) {
            if(character >= 'A' && character <= 'Z'){
                if(firstStringChars.containsKey(character)){
                    firstStringChars.replace(character, firstStringChars.get(character), firstStringChars.get(character)+1);
                }else{
                    firstStringChars.put(character, 1);
                }
            }

        }
        for (char character: secondInputString.toUpperCase().toCharArray()) {
            if(character >= 'A' && character <= 'Z'){
                if(secondStringChars.containsKey(character)){
                    secondStringChars.replace(character, secondStringChars.get(character), secondStringChars.get(character)+1);
                }else{
                    secondStringChars.put(character, 1);
                }
            }

        }

        System.out.println(firstStringChars.toString() + " | " + secondStringChars.toString());

        if(firstStringChars.equals(secondStringChars)){
            System.out.println(firstInputString + " is an anagram to " + secondInputString);
        }else{
            System.out.println(firstInputString + " is not an anagram to " + secondInputString);
        }
    }
}
