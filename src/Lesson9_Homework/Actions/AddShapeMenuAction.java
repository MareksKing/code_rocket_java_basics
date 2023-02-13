package Lesson9_Homework.Actions;

import java.util.List;

import Lesson9_Homework.MenuAction;
import Lesson9_Homework.UserInput;
import Lesson9_Homework.Shapes.ShapeService;


public class AddShapeMenuAction implements MenuAction{

    private final UserInput userInput;
    private final List<String> shapes;
    private final ShapeService shapeService;
    private final InputShapeParametersMenuAction inputParameters;
    
    
    
    public AddShapeMenuAction(UserInput userInput, List<String> shapes, ShapeService shapeService, InputShapeParametersMenuAction inputParameters) {
        this.userInput = userInput;
        this.shapes = shapes;
        this.shapeService = shapeService;
        this.inputParameters = inputParameters;
    }

    @Override
    public String getName() {
        return "Create shape";
    }

    @Override
    public void execute() {
        for (int i = 0; i< shapes.size(); i++) {
            System.out.println(i+1 + ": " + shapes.get(i));
        }
        System.out.println(shapes.size()+1 + ": Exit");
        inputParameters.execute();
        
    }
}
