package Lesson2_Homework.String;

import java.util.Arrays;

public class StringDeleteConsonents {
    
    public static void main(String[] args) {
        
        String stringWithConsonents = new String("Hello, have a good day.");

        char[] charStringWithConsonents = stringWithConsonents.toLowerCase().toCharArray();
        char[] charStringNoConsonents = new char[charStringWithConsonents.length];
        
        for (int i = 0; i < charStringWithConsonents.length; i++) {
            if(isVowel(charStringWithConsonents[i])){
                charStringNoConsonents[i] = charStringWithConsonents[i];
            }
            if(isDigit(charStringWithConsonents[i])){
                charStringNoConsonents[i] = charStringWithConsonents[i];
            }
            if(isWhiteSpace(charStringWithConsonents[i])){
                charStringNoConsonents[i] = charStringWithConsonents[i];
            }
            if(isSymbol(charStringWithConsonents[i])){
                charStringNoConsonents[i] = charStringWithConsonents[i];
            }
        }

        String noConsonentString = new String(charStringNoConsonents);
        System.out.println("String with consonents: " + stringWithConsonents);
        System.out.println("String with no consonents: " + noConsonentString);

    }
    public static boolean isVowel(char nowChar){
        switch(nowChar){
            case 'a':
            return true;
            case 'e':
            return true;
            case 'i':
            return true;
            case 'o':
            return true;
            case 'u':
            return true;
        }
        return false;
    }
    public static boolean isDigit(char nowChar){
        switch(nowChar){
            case '0':
            return true;
            case '1':
            return true;
            case '2':
            return true;
            case '3':
            return true;
            case '4':
            return true;
            case '5':
            return true;
            case '6':
            return true;
            case '7':
            return true;
            case '8':
            return true;
            case '9':
            return true;
        }
        return false;
    }

    public static boolean isWhiteSpace(char nowChar){
        if(nowChar == ' '){
            return true;
        }
        return false;
    }

    public static boolean isSymbol(char nowChar){
        switch(nowChar){
            case '.':
            return true;
            case ',':
            return true;
            case '!':
            return true;
            case '?':
            return true;
        }
        return false;
    }
}
