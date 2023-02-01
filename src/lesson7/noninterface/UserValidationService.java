package lesson7.noninterface;

import lesson7.User;

public class UserValidationService {

    public boolean validate(User user) {
        if (user == null) {
            return false;
        }
        if (user.getAge() == null) {
            return false;
        }
        if (user.getName() == null) {
            return false;
        }
        if (user.getAge() < 16) {
            return false;
        }
        if (!user.getName().matches("[a-zA-Z]{2,16}")) {
            return false;
        }
        return true;
    }
}
