package Lesson3_Homework;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("A: ");
        int a = scanner.nextInt();
        System.out.print("B: ");
        int b = scanner.nextInt();
        System.out.print("C: ");
        int c = scanner.nextInt();
        double x1, x2 = 0;

        double sqrt = Math.pow(b, 2) - 4 * a * c;
        x1 = (-b + Math.sqrt(sqrt))/2*a;
        x2 = (-b - Math.sqrt(sqrt))/2*a;
        System.out.println(x1 + " " + x2);
    }
}
