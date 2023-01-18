package Lesson2_Homework;

import java.util.Scanner;

public class Task44 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 3 numbers");
        System.out.print("Number 1: ");
        int number1 = scanner.nextInt();
        System.out.print("Number 2: ");
        int number2 = scanner.nextInt();
        System.out.print("Number 3: ");
        int number3 = scanner.nextInt();


        if (number3 + number1 == number2 * 2) {
            System.out.println(number2 + " is the middle point of " + number1 + " & " + number3);
        } else if (number1 + number2 == number3 * 2){
            System.out.println(number3 + " is the middle point of " + number1 + " & " + number2);
        }else if (number2 + number3 == number1*2){
            System.out.println(number1+" is the middle point of "+number2 +" & " + number3);
        }else{
            System.err.println("There is no middle point");
        }


    }
}
