package Lesson1_Homework;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.print("Ievadiet minutes: ");
        Scanner input = new Scanner(System.in);
        int time = input.nextInt();
        int days = time/1440;
        int years = 0;
        while(days > 365){
            years = years+1;
            days = days-365;
        }
        System.out.println("Years: "+ years + "| Days: " + days);
    }
}
