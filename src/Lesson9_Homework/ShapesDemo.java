package Lesson9_Homework;


import java.util.List;

public class ShapesDemo {
    public static void main(String[] args) {

        UserInput userInput = new UserInput();


        List<MenuAction> actions = List.of(
                new ShapeChoiceMenuAction(userInput)
                );

        UserMenu userMenu = new UserMenu(userInput, actions);
        userMenu.startMenu();
    }
}
