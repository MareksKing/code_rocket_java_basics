package Lesson2_Homework;

import java.util.Scanner;

public class Task39 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number of sides: ");
        int sides = scanner.nextInt();
        System.out.print("Input side length: ");
        double sideLength = scanner.nextDouble();
        //Formula: 0.25·√(5·(5+2·√5))·6^2

        double area = 0.25 * Math.sqrt(sides*(sides+2*Math.sqrt(sides)))*Math.pow(sideLength, 2);
        System.out.println(area);
    }
}
