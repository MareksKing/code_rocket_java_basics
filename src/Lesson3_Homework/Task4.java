package Lesson3_Homework;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Float point: ");
        float floatNumber = scanner.nextFloat();

        if(Math.abs(floatNumber) < 1.00){
            System.out.print("Small ");
        }else if (Math.abs(floatNumber)  > 1000000.00){
            System.out.print("LARGE ");
        }
        if(floatNumber == 0.00){
            System.out.print("Zero");
        }else if(floatNumber > 0.00){
            System.out.print("Positive");
        }else if(floatNumber < 0.00){
            System.out.print("Negative");
        }

    }
}
