package lesson3.advanced;

import lesson3.UserInputService;

public class UserService {

    public User createUser() {
        UserInputService userInputService = new UserInputService();
        int age = userInputService.getUserAge();

        UserValidationService userValidationService = new UserValidationService();
        User user = new User(age);
        boolean validationResult = userValidationService.validate(user);
        if (validationResult) {
            return user;
        }
        System.out.println("Sorry");
        return null;
    }
}
