package lesson7.interfaces;

import lesson7.User;

public class UserAgeValidationRule implements UserValidationRule {


    @Override
    public boolean validate(User user) {
        if (validateUserNull(user)) {
            return false;
        }
        if (user.getAge() == null) {
            return false;
        }
        if (user.getAge() < 16) {
            return false;
        }
        return true;
    }

}
