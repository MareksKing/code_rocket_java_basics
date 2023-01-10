package Lesson1_Homework;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = input.nextDouble();
        input.close();

        double squareNumber = Math.pow(number, 2);
        double cubeNumber = Math.pow(number, 3);
        double fourthNumber = Math.pow(number, 4);

        System.out.println("Number: " + number);
        System.out.println("Square: " + squareNumber);
        System.out.println("Cube: " + cubeNumber);
        System.out.println("Fourth power: " + fourthNumber);
    }
}
