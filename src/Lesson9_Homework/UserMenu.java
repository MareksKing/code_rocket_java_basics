package Lesson9_Homework;


import java.util.InputMismatchException;
import java.util.List;

public class UserMenu {

    private final UserInput userInput;

    private final List<MenuAction> actions;

    public UserMenu(UserInput userInput, List<MenuAction> actions) {
        this.userInput = userInput;
        this.actions = actions;
    }

    public void startMenu() {
        while (true) {
            printOutMenu();
            try{
                int number = userInput.getNumber()-1;
                if (number >= 0 && number < actions.size()) {
                    actions.get(number).execute();
                } else {
                    System.out.println("Sorry, please try again!");
                }
            }catch (InputMismatchException e){
                System.err.println("Please enter an option number");
            }
        }
    }

    private void printOutMenu() {
        for (int i = 0; i < actions.size(); i++) {
            String menuActionName = actions.get(i).getName();
            System.out.println(i+1 + ". " + menuActionName);
        }
    }
}
