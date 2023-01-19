package Lesson3_Homework;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
        int number = scanner.nextInt();

        int sum =0;
        int i =1;
        int oddNumbers =0;
        while(oddNumbers != number){
            if(i % 2 != 0){
                System.out.println(i);
                oddNumbers++;
                sum += i;
                i++;
            }else{
                i++;
            }
        }
        System.out.println("The Sum of odd Natural Number upto "+ number +" terms is: " +sum );

    }
}
