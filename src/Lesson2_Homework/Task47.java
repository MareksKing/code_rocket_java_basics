package Lesson2_Homework;

import java.util.Scanner;

public class Task47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int number = scanner.nextInt();
        int digitsEven = 0;
        String numberString = Integer.toString(number);
        for (int i = 0; i < numberString.length(); i++) {
            if(Character.valueOf(numberString.charAt(i)) % 2 == 0){
                digitsEven++;
            }
        }

        if(digitsEven == numberString.length()){
            System.out.println("Every digit of the number is even");
        }else{
            System.out.println("Not every digit of the number is even");
        }

    }
}
