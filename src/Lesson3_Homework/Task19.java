package Lesson3_Homework;

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number of rows: ");
        int rows = scanner.nextInt();
        String output = new String();
        for (int i = 0; i <=rows; i++) {
            for (int j=rows-i; j>0; j--)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {

                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
