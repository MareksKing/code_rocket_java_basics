package lesson4.arrays;

public class MultiplicationTableDemo {

    public static void main(String[] args) {
        int[][] multiplicationTable = new int[10][5];
        ArrayUtils.fillMultiplicationTable(multiplicationTable);
        ArrayUtils.printMultiplication(multiplicationTable);
    }
}
