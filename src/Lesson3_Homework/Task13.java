package Lesson3_Homework;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
        int cubeNumber = scanner.nextInt();

        for (int i = 1; i <= cubeNumber; i++) {
            System.out.println("The cube power of "+ i + " = " +Math.pow(i, 3));
        }
    }
}
