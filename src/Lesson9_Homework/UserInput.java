package Lesson9_Homework;

import java.util.Scanner;

public class UserInput {

    public Integer getChoice(){
        System.out.println("Please enter menu number: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
