package lesson3;

public class UserService {

    public static final int LATVIA_LEGAL_AGE = 18;

    public void createUser() {
        UserInputService userInputService = new UserInputService();
        int userAge = userInputService.getUserAge();

        UserAgeValidationService userAgeValidationService = new UserAgeValidationService();
        boolean validationResult = userAgeValidationService.isAgeLessThan(userAge, LATVIA_LEGAL_AGE);
        if (validationResult) {
            System.out.println("Legal age");
        } else {
            System.out.println("sorry");
        }
    }
}
