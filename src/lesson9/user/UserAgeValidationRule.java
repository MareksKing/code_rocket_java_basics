package lesson9.user;

public class UserAgeValidationRule implements UserValidationRule {
    @Override
    public void validate(User user) {
        if (user.getAge() == null) {
            throw new UserValidationException("User age must not be null");
        }
        if (user.getAge() < 16) {
            throw new UserValidationException("User age must be greater than 16");
        }
    }
}
