package Lesson3_Homework;

import java.util.Scanner;

public class Task30 {
    public static void main(String[] args) {

        int[] numbers = new int[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 3 numbers");
        System.out.print("Number 1: ");numbers[0] = scanner.nextInt();
        System.out.print("Number 2: ");numbers[1] = scanner.nextInt();
        System.out.print("Number 3: ");numbers[2] = scanner.nextInt();

        if(numbers[0] == numbers[1] && numbers[1] == numbers[2]){
            System.out.println("All numbers are equal");
        }
        else if(numbers[0] != numbers[1] && numbers[1] != numbers[2] && numbers[0] != numbers[2]){
            System.out.println("All numbers are different");
        }else{
            System.out.println("Neither all are equal or different");
        }

    }
}
