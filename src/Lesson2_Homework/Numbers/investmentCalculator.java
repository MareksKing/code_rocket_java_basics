package Lesson2_Homework.Numbers;

import java.util.Scanner;

public class investmentCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the investment amount: ");
        double principal = scanner.nextDouble();
        System.out.print("Input the rate of interest: ");
        double interest = scanner.nextDouble();
        System.out.print("Input the number of years: ");
        double years = scanner.nextDouble();


        System.out.printf("%-5s" + " | " + "%-5s\n", "Years", "Amount");
        for (int i = 1; i <= years; i++) {
            double amount = principal*Math.pow(1+(interest/100/12),12*i);
            System.out.printf("%,5d" + " | "+ "%,.2f\n", i, amount);
        }
    }
}
