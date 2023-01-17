package Lesson2_Homework.Numbers;

import java.util.Arrays;
import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] averageSum = new int[3];
        System.out.print("Input the first number: ");
        averageSum[0] = input.nextInt();
        System.out.print("Input the second number: ");
        averageSum[1] = input.nextInt();
        System.out.print("Input the third number: ");
        averageSum[2] = input.nextInt();
        double average =0;
        for (int i = 0; i < averageSum.length; i++) {
            average += averageSum[i];
        }
        average = average/averageSum.length;
        System.out.println("The average of " + Arrays.toString(averageSum) + " is : " + average);

    }
}
