package Lesson2_Homework;

import java.util.Scanner;

public class Task42 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
        int input = scanner.nextInt();
        String inputToString = Integer.toString(input);
        int counter = 0;
        for (int i = 0; i < inputToString.length(); i++) {
            if(inputToString.charAt(i) == '2'){
                counter++;
            }
        }
        System.out.println("Number of 2: "+counter);
    }
}
