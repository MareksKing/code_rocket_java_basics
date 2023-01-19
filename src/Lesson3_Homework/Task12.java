package Lesson3_Homework;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the 5 numbers: ");
        String numbers = scanner.nextLine();
        double sum = 0;

        String[] splitNumbers = numbers.split("\\s+");
        for (int i = 0; i < splitNumbers.length; i++) {
            System.out.println(splitNumbers[i]);
            sum += Integer.parseInt(splitNumbers[i]);
        }
        System.out.println("Sum: " + sum + " Average: " + sum/splitNumbers.length);
    }
}
