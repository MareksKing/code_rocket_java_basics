package Lesson9_Homework.Actions;

import Lesson9_Homework.Exceptions.EntityNotFoundException;
import Lesson9_Homework.MenuAction;
import Lesson9_Homework.Shapes.Shape;
import Lesson9_Homework.Shapes.ShapeService;
import Lesson9_Homework.UserInput;

import java.util.InputMismatchException;

public class ChooseOneShapeMenuAction implements MenuAction {

    private final ShapeService shapeService;
    private final UserInput userInput;


    public ChooseOneShapeMenuAction(ShapeService shapeService, UserInput userInput) {
        this.shapeService = shapeService;
        this.userInput = userInput;
    }

    @Override
    public String getName() {
        return "Select a shape";
    }

    @Override
    public void execute() {
        Integer i=1;

        for (Shape shape : shapeService.listShapes()) {
            System.out.println(i + ": " + shape);
            i++;
        }

        try{
            Integer shapeChoice = userInput.getNumber();
            Shape shape = shapeService.getShapeById(shapeChoice);
            System.out.println("Selected: " + shape);

            SelectedShapeMenuAction selectedShape = new SelectedShapeMenuAction(userInput, shape);
            selectedShape.execute();

        }catch (InputMismatchException e){
            System.err.println("That is not a valid option");
        }catch (EntityNotFoundException ex){
            System.err.println("Entity not found");
        }

    }
}
