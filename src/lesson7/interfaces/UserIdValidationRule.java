package lesson7.interfaces;

import lesson7.User;

import java.util.regex.Pattern;

public class UserIdValidationRule implements UserValidationRule {

    private static final Pattern UUID_REGEX = Pattern.compile("^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$");

    @Override
    public boolean validate(User user) {
        if (user.getId() == null) {
            return false;
        }
        if (!UUID_REGEX.matcher(user.getId()).matches()) {
            return false;
        }
        return true;
    }

}
