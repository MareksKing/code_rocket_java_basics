package Lesson1_Homework;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input your weight in pounds: ");
        double weightPounds = input.nextDouble();
        System.out.print("Input your height in inches: ");
        double heightInches = input.nextDouble();
        input.close();
        
        double BMI_Index = (weightPounds / (heightInches * heightInches)) * 703;
        System.out.println(BMI_Index);
    }
}
