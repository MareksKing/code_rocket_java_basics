package Lesson2_Homework.Average;

import java.util.Arrays;
import java.util.Scanner;

public class Average {

    double[] digits = {0, 0, 0};
    double average;
    public void enterDigits(){
        System.out.println("Enter 3 digits");
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Digit nr." + i + ": ");
            digits[i] = input.nextDouble();
        }
        input.close();
    }

    public double calculateAverage(){
        double sumOfArray = 0;
        for (int i = 0; i < digits.length; i++) {
            sumOfArray+=digits[i];
        }
        average = sumOfArray/digits.length;
        return average;
    }

    public void printAverage(){
        System.out.println("The numbers entered were: " + Arrays.toString(digits) + " the average of those numbers is: " + average);
    }
}
