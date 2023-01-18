package Lesson3_Homework;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int number = scanner.nextInt();

        if(number > 0){
            System.out.println("Number is positive");
        }else{
            System.out.println("Number is negative");
        }
    }
}
