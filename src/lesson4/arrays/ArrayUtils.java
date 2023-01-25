package lesson4.arrays;

public class ArrayUtils {

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int number = array[i];
            System.out.println("Index: " + i + ", number: " + number);
        }
    }

    public static void fillMultiplicationTable(int[][] multiplicationTable) {
        for (int row = 0; row < multiplicationTable.length; row++) {
            for (int column = 0; column < multiplicationTable[row].length; column++) {
                int firstValue = row + 1;
                int secondValue = column + 1;
                int multiplicationResult = firstValue * secondValue;
                multiplicationTable[row][column] = multiplicationResult;
            }
        }
    }

    public static void printMultiplication(int[][] multiplicationTable)  {
        for (int row = 0; row < multiplicationTable.length; row++) {
            for (int column = 0; column < multiplicationTable[row].length; column++) {
                System.out.print(multiplicationTable[row][column] + " ");
            }
            System.out.println();
        }
    }
}
