package Lesson2_Homework.Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class Task37 {
    public static void main(String[] args) {

        MatrixService matrixService = new MatrixService();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input n for n x n matrix: ");
        int size = scanner.nextInt();
        Matrix matrix = new Matrix(size);

        matrixService.insertRandomValues(matrix);
        System.out.println(matrixService.printMatrix(matrix));

    }
}
