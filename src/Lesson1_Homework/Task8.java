package Lesson1_Homework;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input 1st integer: ");
        int firstNumber = input.nextInt();
        System.out.print("Input 2nd integer: ");
        int secondNumber = input.nextInt();
        input.close();

        System.out.println("Sum of two integers: " +(firstNumber + secondNumber));
        System.out.println("Difference of two integers: " + (firstNumber - secondNumber));
        System.out.println("Product of two integers: " + (firstNumber * secondNumber));
        System.out.println("Average of two integers: " + (firstNumber + secondNumber)/2);
        System.out.println("Distance of two integers: " + (firstNumber - secondNumber));
        System.out.println("Max integer: " + ((firstNumber>secondNumber) ? firstNumber : secondNumber));
        System.out.println("Min integer: " + ((firstNumber<secondNumber) ? firstNumber : secondNumber));

    }
}
