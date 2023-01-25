package lesson3;

import java.util.Scanner;

public class ConditionIf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();

        //----


        if (age < 18) {
            System.out.println("Go home and grow up");
        } else {
            System.out.println("Enjoy");
        }
    }
}
