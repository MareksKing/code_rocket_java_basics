package Lesson9_Homework.Actions;

import java.util.Scanner;

import Lesson9_Homework.MenuAction;
import Lesson9_Homework.UserInput;


public class ShapeSelectionMenuAction implements MenuAction {

    private final UserInput userInput;
    @Override
    public String getName() {
        return "ShapeSelectionMenuAction";
    }

    @Override
    public void execute() {
        System.out.println("1: Triangle");
        System.out.println("2: Square");
        System.out.println("3: Circle");
        System.out.print("Select a shape:");
        Scanner scanner = new Scanner(System.in);


    }

    
    
}
