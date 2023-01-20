package Lesson3_Homework;

import java.util.Scanner;

public class Task32 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first floating number:");
        float firstNumber = scanner.nextFloat();
        System.out.print("Input the second floating number:");
        float secondNumber = scanner.nextFloat();

        if (Math.abs(firstNumber - secondNumber) <= 0.01) {
            System.out.println("These numbers are the same.");
        }
        else {
            System.out.println("These numbers are different.");
        }
    }
}
