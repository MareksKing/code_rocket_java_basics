package Lesson9_Homework.Actions;

import Lesson9_Homework.MenuAction;
import Lesson9_Homework.Shapes.Shape;
import Lesson9_Homework.UserInput;

import java.util.List;


public class ShapeSelectionMenuAction implements MenuAction {

    private final UserInput userInput;
    private final List<String> shapes;

    public ShapeSelectionMenuAction(UserInput userInput, List<String> shapes) {
        this.userInput = userInput;
        this.shapes = shapes;

    }

    @Override
    public String getName() {
        return "ShapeSelectionMenuAction";
    }

    @Override
    public void execute() {
        for (int i = 0; i< shapes.size(); i++) {
            System.out.println(i+1 + ": " + shapes.get(i));
        }
        System.out.println(shapes.size()+1 + ": Exit");
        Integer choice = userInput.getShapeChoice();
        Shape shape = userInput.choiceEvaluation(choice);
        System.out.println(shape);



    }

    
    
}
