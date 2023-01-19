package Lesson3_Homework;

import java.time.YearMonth;
import java.util.Date;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Date date = new Date();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the month number: ");
        int month = scanner.nextInt();
        System.out.print("Input the year: ");
        int year = scanner.nextInt();

        YearMonth yearMonthObject = YearMonth.of(year, month);
        int daysInMonth = yearMonthObject.lengthOfMonth();
        System.out.println("Days in " + yearMonthObject.getMonth() + " " + yearMonthObject.getYear() + ": " + daysInMonth);

    }
}
