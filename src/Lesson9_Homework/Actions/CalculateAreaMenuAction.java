package Lesson9_Homework.Actions;

import Lesson9_Homework.MenuAction;
import Lesson9_Homework.Shapes.ShapeService;

public class CalculateAreaMenuAction implements MenuAction{


    private final ShapeService shapeService;

    public CalculateAreaMenuAction(ShapeService shapeService) {
        this.shapeService = shapeService;
    }

    @Override
    public String getName() {
        return "Calculate areas";
    }

    @Override
    public void execute() {
        shapeService.listShapes()
                    .stream()
                    .forEach(shape -> System.out.println(shape + " : " + shape.calculateArea()));
    }
    
}
