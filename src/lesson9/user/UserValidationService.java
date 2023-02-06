package lesson9.user;

import java.util.List;

public class UserValidationService {

    private List<UserValidationRule> rules;

    public UserValidationService(List<UserValidationRule> rules) {
        this.rules = rules;
    }

    void validate(User user) {
        rules.forEach(rule -> rule.validate(user));
    }
}
