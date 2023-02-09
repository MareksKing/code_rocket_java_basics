package Lesson9_Homework.Actions;

import Lesson9_Homework.MenuAction;

public class ExitMenuAction implements MenuAction{

    @Override
    public String getName() {
        
        return "Exit";
    }

    @Override
    public void execute() {
        System.out.println("Exiting...");
        System.exit(0);
    }
    
}
