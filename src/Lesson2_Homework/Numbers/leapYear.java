package Lesson2_Homework.Numbers;

import java.util.Scanner;

public class leapYear {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a year: ");
        int year = scanner.nextInt();

        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.println(true);
                }else{
                    System.out.println(false);
                }
            }else{
                System.out.println(true);
            }
        }else{
            System.out.println(false);
        }
    }
}
