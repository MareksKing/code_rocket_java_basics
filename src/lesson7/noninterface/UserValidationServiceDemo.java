package lesson7.noninterface;

import lesson7.User;

public class UserValidationServiceDemo {

    public static void main(String[] args) {
        User user = new User("4e63e066-28c8-4ff3-856f-2d8c9eba4083", "Ruslan", 16);

        UserValidationService userValidationService = new UserValidationService();

        boolean result = userValidationService.validate(user);

        System.out.println(result);
    }
}
