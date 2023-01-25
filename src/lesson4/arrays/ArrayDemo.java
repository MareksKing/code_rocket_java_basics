package lesson4.arrays;

public class ArrayDemo {

    public static void main(String[] args) {
        int[] array = new int[10];
        array[0] = 123;
        array[9] = 321;

        ArrayUtils.printArray(array);


        int[][] twoDimensionalArray = new int[3][3];
        int[] ints = twoDimensionalArray[1];
    }
}
