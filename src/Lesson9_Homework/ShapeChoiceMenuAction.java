package Lesson9_Homework;

public class ShapeChoiceMenuAction implements MenuAction{

    private final UserInput userInput;

    public ShapeChoiceMenuAction(UserInput userInput) {
        this.userInput = userInput;
    }

    @Override
    public String getName() {
        return "Choose shape";
    }

    @Override
    public void execute() {

    }
}
