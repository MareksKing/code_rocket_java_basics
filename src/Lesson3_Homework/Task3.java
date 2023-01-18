package Lesson3_Homework;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number1: ");
        int number1 = scanner.nextInt();
        System.out.print("Number2: ");
        int number2 = scanner.nextInt();
        System.out.print("Number3: ");
        int number3 = scanner.nextInt();

        int biggestNumber = number1;
        if(biggestNumber<number2){
            biggestNumber = number2;
        }
        if (biggestNumber<number3){
            biggestNumber=number3;
        }
        System.out.println(biggestNumber);
    }
}
