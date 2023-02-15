package Lesson9_Homework.Actions;

import Lesson9_Homework.Exceptions.EntityNotFoundException;
import Lesson9_Homework.MenuAction;
import Lesson9_Homework.Shapes.Shape;
import Lesson9_Homework.UserInput;

import java.util.InputMismatchException;

public class SelectedShapeMenuAction implements MenuAction {

    private final UserInput userInput;
    private final Shape shape;

    public SelectedShapeMenuAction(UserInput userInput, Shape shape) {
        this.userInput = userInput;
        this.shape = shape;
    }

    @Override
    public String getName() {
        return "Selected shape";
    }

    @Override
    public void execute() {
        System.out.println("What do you want to do with: " + shape + " ?");
        System.out.println("1. Calculate Perimeter");
        System.out.println("2. Calculate Area");
        System.out.println("3. Exit");


            try {
                Integer choice = userInput.getNumber()+1;
                switch (choice){
                    case 1:
                        System.out.println("Calculating Perimeter...");
                        Double perimeter = shape.calculatePerimeter();
                        System.out.println("Perimeter: " + perimeter);
                        break;
                    case 2:
                        System.out.println("Calculating Area...");
                        Double area = shape.calculateArea();
                        System.out.println("Area: " + area);
                        break;
                    case 3:
                        System.out.println("Exiting..");
                        break;
                    default:
                        System.out.println("Invalid input");
                }
            }catch (InputMismatchException e){
                System.out.println("Wrong input");
            }



    }
}
