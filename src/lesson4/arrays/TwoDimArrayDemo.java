package lesson4.arrays;

public class TwoDimArrayDemo {

    public static void main(String[] args) {
        int[][] array = new int[5][5];
        array[0][0] = 1;
        array[0][1] = 2;

        System.out.println(array[0][0]);

        System.out.println(array);
    }
}
