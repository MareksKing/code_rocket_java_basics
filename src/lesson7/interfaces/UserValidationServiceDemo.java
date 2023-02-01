package lesson7.interfaces;

import java.util.HashSet;
import java.util.Set;

public class UserValidationServiceDemo {

    public static void main(String[] args) {
        Set<UserValidationRule> rules = new HashSet<>();

        rules.add(new UserAgeValidationRule());
        rules.add(new UserNameValidationRule());
        rules.add(new UserIdValidationRule());


        UserValidationService userValidationService = new UserValidationService(rules);
        boolean result = userValidationService.validate(null);

        System.out.println(result);
    }
}
