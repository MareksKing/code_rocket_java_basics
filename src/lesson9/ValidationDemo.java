package lesson9;

public class ValidationDemo {

    public static void main(String[] args) {
        int side = -1;

        check1(side);

        System.out.println("Validated!");
    }

    private static void check1(int side) {
        check2(side);
    }

    private static void check2(int side) {
        check3(side);
    }

    private static void check3(int side) {
        if (side <= 0) {
            throw new ValidationException("Side must be greater than 0");
        }
    }
}
