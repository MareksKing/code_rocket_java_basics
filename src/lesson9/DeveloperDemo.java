package lesson9;

public class DeveloperDemo {

    public static void main(String[] args) {
        Student student = new Student();
        student.learn();

        System.out.println("-------");

        JuniorDeveloper juniorDeveloper = new JuniorDeveloper();
        juniorDeveloper.learn();
        juniorDeveloper.writeCode();

        System.out.println("-------");

        MidDeveloper midDeveloper = new MidDeveloper();
        midDeveloper.learn();
        midDeveloper.writeCode();
        midDeveloper.debug();

        System.out.println("-------");

        SeniorDevelop seniorDevelop = new SeniorDevelop();
        seniorDevelop.learn();
        seniorDevelop.writeCode();
        seniorDevelop.debug();
        seniorDevelop.cry();

    }
}
