package lesson9.user;

public class UserNameValidationRule implements UserValidationRule {

    @Override
    public void validate(User user) {
        if (user.getName() == null) {
            throw new UserValidationException("User name must not be null");
        }

        if (!user.getName().matches("[a-zA-Z]{2,16}")) {
            throw new UserValidationException("User name must match the regex '[a-zA-Z]{2,16}'");
        }
    }
}
