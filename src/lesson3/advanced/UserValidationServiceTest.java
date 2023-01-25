package lesson3.advanced;

public class UserValidationServiceTest {

    public static void main(String[] args) {
        ageLessThan18();
        ageEquals18();
        ageGreaterThan18();
        userIsNull();
    }

    private static void ageLessThan18() {
        UserValidationService userValidationService = new UserValidationService();
        User user = new User(16);
        boolean result = userValidationService.validate(user);
        if (result == false) {
            System.out.println("ageLessThan18: SUCCESS");
        } else {
            System.err.println("ageLessThan18: FAILED");
        }
    }

    private static void ageEquals18() {
        UserValidationService userValidationService = new UserValidationService();
        User user = new User(18);
        boolean result = userValidationService.validate(user);
        if (result == true) {
            System.out.println("ageEquals18: SUCCESS");
        } else {
            System.err.println("ageEquals18: FAILED");
        }
    }

    private static void ageGreaterThan18() {
        UserValidationService userValidationService = new UserValidationService();
        User user = new User(21);
        boolean result = userValidationService.validate(user);
        if (result == true) {
            System.out.println("ageGreaterThan18: SUCCESS");
        } else {
            System.err.println("ageGreaterThan18: FAILED");
        }
    }


    private static void userIsNull() {
        UserValidationService userValidationService = new UserValidationService();
        User user = null;
        boolean result = userValidationService.validate(user);
        if (result == false) {
            System.out.println("userIsNull: SUCCESS");
        } else {
            System.err.println("userIsNull: FAILED");
        }
    }
}
