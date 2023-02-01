package lesson7.interfaces;

import lesson7.User;

public class UserNotNullValidationRule implements UserValidationRule {


    @Override
    public boolean validate(User user) {
        return user != null;
    }

}
