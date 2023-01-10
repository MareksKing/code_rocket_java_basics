package Lesson1_Homework;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input your weight in pounds: ");
        int weightPounds = input.nextInt();
        System.out.print("Input your height in inches: ");
        int heightInches = input.nextInt();

        double BMI_Index = weightPounds*703/heightInches/heightInches;
        System.out.println(BMI_Index);
    }
}
