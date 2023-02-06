package lesson8;

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
            int number = userInput.getNumber();
            if (number >= 0 && number < actions.size()) {
                actions.get(number).execute();
            } else {
                System.out.println("Sorry, please try again!");
            }
        }
    }

    private void printOutMenu() {
        for (int i = 0; i < actions.size(); i++) {
            String menuActionName = actions.get(i).getName();
            System.out.println(i + ". " + menuActionName);
        }
    }

}
