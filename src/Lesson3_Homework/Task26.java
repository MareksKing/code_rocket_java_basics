package Lesson3_Homework;

import java.util.Scanner;

public class Task26 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number of rows: ");

        //Code from https://www.w3resource.com/java-exercises/conditional-statement/java-conditional-statement-exercise-26.php :D
        int n = scanner.nextInt();
        int count = 1;
        int count2 = 1;
        char c = 'A';

        for (int i = 1; i < (n * 2); i++) {
            for (int spc = n - count2; spc > 0; spc--)
            //print space
            {
                System.out.print(" ");
            }
            if (i < n) {
                count2++;
            } else {
                count2--;
            }
            for (int j = 0; j < count; j++) {
                System.out.print(c);//print Character
                if (j < count / 2) {
                    c++;
                } else {
                    c--;
                }
            }
            if (i < n) {
                count = count + 2;
            } else {
                count = count - 2;
            }
            c = 'A';

            System.out.println();
        }
    }
}
