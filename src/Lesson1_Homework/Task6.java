package Lesson1_Homework;

import java.util.Scanner;

public class Task6{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input distance in meters: ");
        double meters = input.nextDouble();
        System.out.print("Input hour: ");
        double hours = input.nextDouble();
        System.out.print("Input minutes: ");
        double minutes = input.nextDouble();
        System.out.print("Input seconds: ");
        double seconds = input.nextDouble();
        input.close();
        
        double completeSeconds = seconds+minutes*60+hours*3600;
        double completeHours = hours + minutes/60 + seconds/3600;
        double miles = meters/1609;

        double metersPerSecond = meters/completeSeconds;
        System.out.println("Speed in m/s: " + metersPerSecond);

        double kilometersPerHour = (meters/1000)/completeHours;
        System.out.println("Speed in km/h: "+kilometersPerHour);

        double milesPerHour = miles/completeHours;
        System.out.println("Speed in miles/h: "+milesPerHour);
    }
}