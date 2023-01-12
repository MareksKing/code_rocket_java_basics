package Lesson2;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter number: ");
        int firstNumber = scanner.nextInt();
        System.out.println(firstNumber);
    }
}
