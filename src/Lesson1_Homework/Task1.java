package Lesson1_Homework;


import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        System.out.print("Ievadiet collu daudzumu: ");
        Scanner input = new Scanner(System.in);
        int inches = input.nextInt();

        System.out.println("Inches: " + inches);
        double meters = inches * 0.0254;
        System.out.println("Meters : " + meters);


    }
}
