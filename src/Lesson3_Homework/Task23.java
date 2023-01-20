package Lesson3_Homework;

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 0; i <=rows; i++) {
            for (int j = rows; j >= i+1; j--) {

                System.out.print("*");
            }
            System.out.println();
            for (int j=0; j<=i; j++)
            {
                System.out.print(" ");
            }
        }
    }
}
