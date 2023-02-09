package Lesson9_Homework;

import java.util.Scanner;

import Lesson9_Homework.Shapes.Shape;
import Lesson9_Homework.Shapes.ShapeChoiceRequest;

public class UserInput {

    public Integer getChoice(){
        System.out.print("Please enter menu number: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public Integer getShapeChoice(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1: Triangle");
        System.out.println("2: Square");
        System.out.println("3: Circle");
        System.out.print("Select a shape:");
        return scanner.nextInt();
    }

    public ShapeChoiceRequest
}
