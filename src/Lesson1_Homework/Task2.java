package Lesson1_Homework;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) throws Exception {

        int sum = 0;
        System.out.print("Ievadiet skaitli: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if(number < 0 || number > 1000){
            throw new Exception("Skaitlis pārāk liels, skaitlim jābūt 0 < x < 1000");
        }
        while (number > 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        System.out.println(sum);

    }
}
