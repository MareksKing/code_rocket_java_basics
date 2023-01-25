package lesson4;

public class Math {

    public int pow(int number, int power) {
        int result = 1;
        if (power == 0) {
            return result;
        }
        for (int i = 1; i <= power; i++) {
            result = result * number;
        }
        return result;
    }
}
