package Lesson2_Homework.String;

import java.util.Scanner;

public class betweenCharacterPrint {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input from which character you want to begin: ");
        String firstCharacter = scanner.next();
        System.out.print("Input at which character you want to stop: ");
        String secondCharacter = scanner.next();
        int newLineCounter = 0;

        for (int i = firstCharacter.hashCode(); i <= secondCharacter.hashCode(); i++) {
            if(newLineCounter == 19){
                System.out.print(Character.toString(i)+ "\n");
                newLineCounter = 0;
            }else{
                System.out.print(Character.toString(i) + " ");
                newLineCounter++;

            }
        }
    }
}
