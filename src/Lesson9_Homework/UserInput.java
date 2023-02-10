package Lesson9_Homework;

import java.sql.SQLOutput;
import java.util.Scanner;

import Lesson9_Homework.Shapes.*;

public class UserInput {

    public Integer getNumber(){
        System.out.print("Please enter menu number: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public Integer getShapeChoice(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Select a shape:");
        return scanner.nextInt();
    }

    public Shape choiceEvaluation(Integer choice){
        switch(choice){
            case 1:
                return createCircle();
            case 2:
                return createTriangle();
            case 3:
                return createSquare();
            case 4:
                break;

        }
        return null;
    }

    private Square createSquare() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input length of side A: ");
        Double sideA = scanner.nextDouble();
        System.out.print("Input length of side B: ");
        Double sideB = scanner.nextDouble();
        return new Square(sideA, sideB);
    }

    private Triangle createTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input length of side A: ");
        Double sideA = scanner.nextDouble();
        System.out.print("Input length of side B: ");
        Double sideB = scanner.nextDouble();
        return new Triangle(sideA, sideB);
    }

    private Circle createCircle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input length of the radius: ");
        Double radius = scanner.nextDouble();
        return new Circle(radius);
    }
}
