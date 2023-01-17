package Lesson2_Homework.Numbers;

import java.util.Scanner;

public class SmallestNumberFinder {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] smallestNumberArray = new int[3];
        System.out.print("Input the first number: ");
        smallestNumberArray[0] = input.nextInt();
        System.out.print("Input the second number: ");
        smallestNumberArray[1] = input.nextInt();
        System.out.print("Input the third number: ");
        smallestNumberArray[2] = input.nextInt();

        int smallestNumber = smallestNumberArray[0];
        for (int i = 0; i < smallestNumberArray.length; i++) {
            if(smallestNumber > smallestNumberArray[i]){
                smallestNumber = smallestNumberArray[i];
            }

        }
        System.out.println("Smallest number is: " + smallestNumber);
    }
}
