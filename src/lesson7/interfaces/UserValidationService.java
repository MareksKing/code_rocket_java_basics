package lesson7.interfaces;

import lesson7.User;

import java.util.Set;

public class UserValidationService {

    private Set<UserValidationRule> userValidationRules;

    public UserValidationService(Set<UserValidationRule> userValidationRules) {
        this.userValidationRules = userValidationRules;
    }

    public boolean validate(User user) {
        if (user == null) {
            return false;
        }
        for (UserValidationRule rule : userValidationRules) {
            if (!rule.validate(user)) {
                return false;
            }
        }
        return true;
    }
}
