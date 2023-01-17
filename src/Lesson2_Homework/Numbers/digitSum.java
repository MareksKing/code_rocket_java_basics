package Lesson2_Homework.Numbers;

import java.util.Scanner;

public class digitSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = scanner.nextInt();
        String stringNumber = String.valueOf(number);
        int sum = 0;

        for (int i = 0; i < stringNumber.length(); i++) {
            sum += Character.getNumericValue(stringNumber.charAt(i));
        }
        System.out.println("The sum of both numbers is: " + sum);

    }
}
