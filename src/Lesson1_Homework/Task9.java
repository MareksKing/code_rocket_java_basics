package Lesson1_Homework;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number to be split into digits: ");
        int number = input.nextInt();

        if(number < 0){ throw new Exception("Number must be non-negative");}

        String numberString = Integer.toString(number);
        char[] numberArray = numberString.toCharArray();

        System.out.print("[ ");
        for (int i = 0; i < numberArray.length; i++) {
            System.out.print(numberArray[i] + " ");
        }
        System.out.print("]");


    }
}
