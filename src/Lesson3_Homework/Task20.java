package Lesson3_Homework;

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number of rows: ");
        int rows = scanner.nextInt();
        String output = new String();
        int startNumber = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(startNumber + " ");
                startNumber++;
            }

            System.out.println();
        }
    }
}
