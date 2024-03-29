package Lesson9_Homework;

import java.util.Scanner;

import Lesson9_Homework.Shapes.*;

public class UserInput {

    public Integer getNumber(){
        System.out.print("Please enter an option number: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt()-1;
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
                return createRectangle();
            case 4:
                break;

        }
        return null;
    }

    private Rectangle createRectangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input length of side A: ");
        Double sideA = scanner.nextDouble();
        System.out.print("Input length of side B: ");
        Double sideB = scanner.nextDouble();
        if(sideA < 1 || sideB < 1){
            throw new IllegalArgumentException("Only positive numbers");
        }
        return new Rectangle(sideA, sideB);
    }

    private Triangle createTriangle() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input length of side A: ");
        Double sideA = scanner.nextDouble();
        System.out.print("Input length of side B: ");
        Double sideB = scanner.nextDouble();
        if(sideA < 1 || sideB < 1){
            throw new IllegalArgumentException("Only positive numbers");
        }
        return new Triangle(sideA, sideB);
    }

    private Circle createCircle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input length of the radius: ");
        Double radius = scanner.nextDouble();
        if(radius < 1){
            throw new IllegalArgumentException("Only positive numbers");
        }
        return new Circle(radius);
    }
}
