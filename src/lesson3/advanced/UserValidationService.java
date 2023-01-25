package lesson3.advanced;

import lesson3.UserAgeValidationService;

public class UserValidationService {

    public boolean validate(User user) {
        UserAgeValidationService userAgeValidationService = new UserAgeValidationService();
        if (user == null) {
            return false;
        }
        int age = user.getAge();
        return userAgeValidationService.isAgeGreaterEqThan(age, 18);
    }
}
