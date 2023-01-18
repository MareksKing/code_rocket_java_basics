package Lesson2_Homework;

import java.util.Scanner;

public class Task46 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int number = scanner.nextInt();

        String outputString = new String(Integer.toString(number) + " =");

        while(number % 3 == 0){
            outputString += " 3 *";
            number /= 3;
        }
        outputString += " 1";
        System.out.println(outputString);
    }
}
