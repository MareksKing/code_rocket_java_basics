package lesson5.array;

public class ArrayUtilsDemo {

    public static void main(String[] args) {
        int[] array = ArrayUtils.createArray(5);
        ArrayUtils.fillArrayWithRandomNumberInRange(array, -10, 10);
        ArrayUtils.printArray(array);
    }
}
