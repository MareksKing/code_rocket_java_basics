package Lesson1_Homework;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Input the time zone offset to GMT: ");
        int timeZoneChange = input.nextInt();
        input.close();

        long totalMilliseconds = System.currentTimeMillis();
        
        long totalSeconds = totalMilliseconds / 1000;
        
        long currentSecond = totalSeconds % 60;
        
        long totalMinutes = totalSeconds / 60;

        long currentMinute = totalMinutes % 60;
        
        long totalHours = totalMinutes / 60;
        
        long currentHour = ((totalHours + timeZoneChange) % 24);
        
        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);
    }
}
