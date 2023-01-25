package lesson5.array;

import java.util.Random;

public class ArrayUtils {

    public static int[] createArray(int size) {
        return new int[size];
    }

    public static void fillArrayWithRandomNumber(int[] array) {
        Random randomGenerator = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = randomGenerator.nextInt(101);
        }
    }

    //random -10..+10
    //random 20..30
    // rand(max - min) + min

    public static void fillArrayWithRandomNumberInRange(int[] array, int min, int max) {
        Random randomGenerator = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = randomGenerator.nextInt(max + 1 - min) + min;
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
