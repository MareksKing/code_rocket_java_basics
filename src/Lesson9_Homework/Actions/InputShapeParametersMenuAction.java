package Lesson9_Homework.Actions;

import Lesson9_Homework.MenuAction;
import Lesson9_Homework.UserInput;
import Lesson9_Homework.Shapes.Shape;
import Lesson9_Homework.Shapes.ShapeService;


public class InputShapeParametersMenuAction implements MenuAction{

    private final UserInput userInput;
    private final ShapeService shapeService;
    
    
    public InputShapeParametersMenuAction(UserInput userInput, ShapeService shapeService) {
        this.userInput = userInput;
        this.shapeService = shapeService;
    }

    @Override
    public String getName() {
        return "Input Parameters";
    }

    @Override
    public void execute() {
        Integer choice = userInput.getShapeChoice();
        Shape shape = userInput.choiceEvaluation(choice);
        System.out.println(shape);
        shapeService.save(shape);
        
    }
    
}
