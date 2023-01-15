package Lesson2_Homework.String;

import java.util.Scanner;

public class StringContentCounter {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String contentString = input.nextLine();
        input.close();
        int vowelCounter = 0;
        int consonentCounter = contentString.length();
        int digitCounter = 0;
        int whiteSpaceCounter = 0;

        
        
        char[] charContentString = contentString.toLowerCase().toCharArray();
        for (int i = 0; i < charContentString.length; i++) {
            if(charContentString[i] == ' '){
                whiteSpaceCounter++;
                consonentCounter--;
            }

            switch(charContentString[i]){
                case 'a':
                vowelCounter++;
                consonentCounter--;
                break;
                case 'e':
                vowelCounter++;
                consonentCounter--;
                break;
                case 'i':
                vowelCounter++;
                consonentCounter--;
                break;
                case 'o':
                vowelCounter++;
                consonentCounter--;
                break;
                case 'u':
                vowelCounter++;
                consonentCounter--;
                break;
            }

            switch(charContentString[i]){
                case '0':
                digitCounter++;
                consonentCounter--;
                break;
                case '1':
                digitCounter++;
                consonentCounter--;
                break;
                case '2':
                digitCounter++;
                consonentCounter--;
                break;
                case '3':
                digitCounter++;
                consonentCounter--;
                break;
                case '4':
                digitCounter++;
                consonentCounter--;
                break;
                case '5':
                digitCounter++;
                consonentCounter--;
                break;
                case '6':
                digitCounter++;
                consonentCounter--;
                break;
                case '7':
                digitCounter++;
                consonentCounter--;
                break;
                case '8':
                digitCounter++;
                consonentCounter--;
                break;
                case '9':
                digitCounter++;
                consonentCounter--;
                break;
            }
            
        }

        System.out.println("Contents of the string are: " + vowelCounter + " vowels, " + consonentCounter + " consonents, " + digitCounter + " digits & " + whiteSpaceCounter + " white spaces.");

        

    }
}
