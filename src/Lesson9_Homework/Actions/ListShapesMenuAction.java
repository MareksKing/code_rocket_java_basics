package Lesson9_Homework.Actions;

import Lesson9_Homework.MenuAction;
import Lesson9_Homework.Shapes.ShapeService;

public class ListShapesMenuAction implements MenuAction{

    private final ShapeService shapeService;

    
    public ListShapesMenuAction(ShapeService shapeService) {
        this.shapeService = shapeService;
    }

    @Override
    public String getName() {
        
        return "List Shapes";
    }

    @Override
    public void execute() {

        shapeService.listShapes().forEach(shape -> System.out.println(shape));
        
    }
    
}
