package Lesson3_Homework;

import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                int number = factorial(i)/(factorial(i-j)*factorial(j));
                System.out.print(" " + number);
            }
            System.out.println();
        }
    }
    public static int factorial(int i)
    {
        if (i == 0)
            return 1;
        return i * factorial(i - 1);
    }
}
