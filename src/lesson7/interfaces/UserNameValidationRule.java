package lesson7.interfaces;

import lesson7.User;

public class UserNameValidationRule implements UserValidationRule {

    @Override
    public boolean validate(User user) {
        if (user.getName() == null) {
            return false;
        }
        if (!user.getName().matches("[a-zA-Z]{2,16}")) {
            return false;
        }
        return true;
    }
}
