package Lesson2_Homework;

import java.util.Scanner;

public class Task45 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int number = scanner.nextInt();
        int firstDigit = 0;
        if(number < 0){
            number *= -1;
            firstDigit = Integer.parseInt(Integer.toString(number).substring(0, 1));
            firstDigit *= -1;
        }else{
            firstDigit = Integer.parseInt(Integer.toString(number).substring(0, 1));
        }
        System.out.println(firstDigit);
    }
}
