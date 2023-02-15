package Lesson9_Homework;


import java.util.List;

import Lesson9_Homework.Actions.*;
import Lesson9_Homework.Shapes.ShapeRepository;
import Lesson9_Homework.Shapes.ShapeService;

public class ShapesDemo {
    public static void main(String[] args) {

        UserInput userInput = new UserInput();
        ShapeRepository shapeRepository = new ShapeRepository();
        ShapeService shapeService = new ShapeService(shapeRepository);
        InputShapeParametersMenuAction inputParameters=  new InputShapeParametersMenuAction(userInput, shapeService);


        List<String> shapes = List.of(
                "Circle",
                "Triange",
                "Rectangle"
        );

        List<MenuAction> actions = List.of(
                new AddShapeMenuAction(userInput, shapes, shapeService, inputParameters),
                new ListShapesMenuAction(shapeService),
                new ChooseOneShapeMenuAction(shapeService, userInput),
                new CalculatePerimeterMenuAction(shapeService),
                new CalculateAreaMenuAction(shapeService),
                new ExitMenuAction()
                );

        UserMenu userMenu = new UserMenu(userInput, actions);
        userMenu.startMenu();
    }
}
