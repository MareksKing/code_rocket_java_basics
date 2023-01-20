package Lesson3_Homework;

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number of rows: ");

        //Code from https://www.w3resource.com/java-exercises/conditional-statement/java-conditional-statement-exercise-25.php :D
        int n = scanner.nextInt();
        int count = 1;
        int no_of_spaces = 1;
        int start = 0;

        for (int i = 1; i < (n * 2); i++)
        {

            for (int spc = n - no_of_spaces; spc > 0; spc--)
            {
                System.out.print(" ");
            }
            if (i < n)
            {
                start = i;
                no_of_spaces++;
            } else
            {
                start = n * 2 - i;
                no_of_spaces--;
            }
            for (int j = 0; j < count; j++)
            {
                System.out.print(start);
                if (j < count / 2)
                {
                    start--;
                } else
                {
                    start++;
                }
            }
            if (i < n)
            {
                count = count + 2;
            } else {
                count = count - 2;
            }

            System.out.println();
        }
    }
}
