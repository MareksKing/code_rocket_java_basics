package Lesson3_Homework;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
        double number = scanner.nextDouble();
        double sum = 0;
        System.out.println("The first "+ number + " of natural numbers are: ");
        for (int i = 1; i <= number; i++) {
            System.out.println(i);
            sum += i;
        }
        System.out.println(sum);

    }
}
