package lesson7.interfaces;

import lesson7.User;

public class UserAgeValidationRuleTest {

    public static void main(String[] args) {
        shouldReturnFalseWhenAgeIsNull();
    }

    private static void shouldReturnFalseWhenAgeIsNull() {
        User user = new User("123123", "123123", null);
        UserValidationRule ageRule = new UserAgeValidationRule();

        boolean result = ageRule.validate(user);

        if (!result) {
            System.out.println("shouldReturnFalseWhenAgeIsNull: SUCCESS");
        } else {
            System.err.println("shouldReturnFalseWhenAgeIsNull: FAILED, expected: false, actual: " + result);
        }
    }
}
