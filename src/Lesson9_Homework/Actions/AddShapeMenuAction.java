package Lesson9_Homework.Actions;

import Lesson9_Homework.MenuAction;
import Lesson9_Homework.UserInput;

public class AddShapeMenuAction implements MenuAction{

    private final UserInput userInput;
    private final ShapeSelectionMenuAction shapeSelection;

   

    public AddShapeMenuAction(UserInput userInput, ShapeSelectionMenuAction shapeSelection) {
        this.userInput = userInput;
        this.shapeSelection = shapeSelection;
    }

    @Override
    public String getName() {
        return "Choose shape";
    }

    @Override
    public void execute() {
        System.out.println("Executing: " + getName());
        shapeSelection.execute();
    }
}
