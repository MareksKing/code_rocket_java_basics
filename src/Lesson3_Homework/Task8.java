package Lesson3_Homework;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the a character: ");
        String character = scanner.next();
        if(character.toCharArray().length > 1){
            System.out.println("Not a char, but a string");
        }else{
            char[] characterChar = character.toLowerCase().toCharArray();
            int decision = checkLetter(characterChar[characterChar.length-1]);
            if(decision == 2){
                System.out.println("Character is neither");
            }
            if(decision == 1){
                System.out.println("Character is consonent");
            }
            if(decision == 0){
                System.out.println("Character is vowel");
            }
        }
    }

    public static boolean isVowel(char character){

        switch (character){
            case 'a':
            case 'e':
            case 'u':
            case 'i':
            case 'o':
                return true;
        }
        return false;
    }

    public static boolean isConsonent(char character){
        if(Character.isLetter(character)){
            return true;
        }
        return false;
    }

    public static int checkLetter(char character){
        if(isVowel(character)){
            return 0;
        }
        if(isConsonent(character)){
            return 1;
        }
        return 2;
    }
}
