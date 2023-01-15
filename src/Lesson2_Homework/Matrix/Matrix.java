package Lesson2_Homework.Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {

    int rows;
    int columns;
    int[][] matrixArray;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.matrixArray = new int[rows][columns];
    }


    public Matrix() {
    }


    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    

}
