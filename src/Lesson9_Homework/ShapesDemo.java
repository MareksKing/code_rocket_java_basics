package Lesson9_Homework;


import java.util.List;

import Lesson9_Homework.Actions.ExitMenuAction;
import Lesson9_Homework.Actions.ShapeSelectionMenuAction;
import Lesson9_Homework.Actions.AddShapeMenuAction;

public class ShapesDemo {
    public static void main(String[] args) {

        UserInput userInput = new UserInput();

        List<String> shapes = List.of(
                "Circle",
                "Triange",
                "Square"
        );
        ShapeSelectionMenuAction shapeSelectionMenuAction = new ShapeSelectionMenuAction(userInput, shapes);


        List<MenuAction> actions = List.of(
                new AddShapeMenuAction(userInput, shapeSelectionMenuAction),
                new ExitMenuAction()
                );

        UserMenu userMenu = new UserMenu(userInput, actions);
        userMenu.startMenu();
    }
}
