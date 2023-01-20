package Lesson3_Homework;

import java.util.Scanner;

public class Task27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = scanner.nextInt();

        if(number > 0){
            System.out.println("Number is positive");
        }else if (number < 0){
            System.out.println("Number is negative");
        }else{
            System.out.println("Number is 0");
        }

    }
}
