package Lesson2_Homework.Triangle;

import java.util.Scanner;

public class Task38 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input length of Side-1: ");
        double side1 = scanner.nextDouble();
        System.out.print("Input length of Side-2: ");
        double side2 = scanner.nextDouble();
        System.out.print("Input length of Side-3: ");
        double side3 = scanner.nextDouble();

        double semiPerimeter = (side1 + side2 + side3)/2;
        //√[s(s – a)(s – b)(s – c)]
        double area = Math.sqrt(semiPerimeter*(semiPerimeter-side1)*(semiPerimeter-side2)*(semiPerimeter-side3));
        System.out.println(area);
    }
}
