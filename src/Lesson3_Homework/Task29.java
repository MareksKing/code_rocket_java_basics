package Lesson3_Homework;

import java.util.Scanner;

public class Task29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = scanner.nextInt();
        System.out.println("Number of digits in the number: "+Integer.toString(number).length());
    }
}
