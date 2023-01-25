package lesson3;

public class UserAgeValidationService {

    public boolean isAgeLessThan(int age, int limit) {
        return age < limit;
    }

    public boolean isAgeGreaterThan(int age, int limit) {
        return age > limit;
    }

    public boolean isAgeLessEqThan(int age, int limit) {
        return age <= limit;
    }

    public boolean isAgeGreaterEqThan(int age, int limit) {
        return age >= limit;
    }
}
