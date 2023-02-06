package lesson9.user;

import java.util.InputMismatchException;
import java.util.List;

public class UserValidationDemo {

    public static void main(String[] args) {
        List<UserValidationRule> rules = List.of(
                new UserNameValidationRule(),
                new UserAgeValidationRule()
        );

        UserValidationService userValidationService = new UserValidationService(rules);

        User user = new User("ABAC", -1);
        try {
            userValidationService.validate(user);
        } catch (UserValidationException | InputMismatchException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("NEXT CODE ...");
    }
}
