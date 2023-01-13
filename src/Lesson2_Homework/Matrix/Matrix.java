package Lesson2_Homework.Matrix;

import java.util.Scanner;

public class Matrix {

    int rows;
    int columns;
    int [][] matrixArray = new int[rows][columns];

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
    }

    public void insertValues(){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Matrix value at: " + i + "; " + j + ": ");
                Scanner input = new Scanner(System.in);
                matrixArray[i][j] = input.nextInt();
            }
        }
    }
}
