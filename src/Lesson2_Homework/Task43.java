package Lesson2_Homework;

import java.util.Scanner;

public class Task43 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 3 numbers");
        System.out.print("Number 1: ");
        int number1 = scanner.nextInt();
        System.out.print("Number 2: ");
        int number2 = scanner.nextInt();
        System.out.print("Number 3: ");
        int number3 = scanner.nextInt();

        if(number1-number2 == -1 && number2-number3 == -1){
            System.out.println("Numbers are consecutive");
        }else{
            System.err.println("Numbers are not consecutive");
        }
    }
}
