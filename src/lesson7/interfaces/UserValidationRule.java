package lesson7.interfaces;

import lesson7.User;

public interface UserValidationRule {

    boolean validate(User user);

    default boolean validateUserNull(User user) {
        return user == null;
    }

}
