package Lesson9_Homework.Actions;

import Lesson9_Homework.MenuAction;
import Lesson9_Homework.Shapes.Shape;
import Lesson9_Homework.Shapes.ShapeService;

public class CalculatePerimeterMenuAction implements MenuAction{

    private final ShapeService shapeService;


    public CalculatePerimeterMenuAction(ShapeService shapeService) {
        this.shapeService = shapeService;
    }

    @Override
    public String getName() {
        return "Calculate perimetres";
    }

    @Override
    public void execute() {
        shapeService.listShapes()
                    .stream()
                    .forEach(shape -> System.out.println(shape + " : " + shape.calculatePerimeter()));
        
        
        
    }

}
