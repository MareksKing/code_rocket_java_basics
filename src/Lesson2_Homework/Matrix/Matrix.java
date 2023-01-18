package Lesson2_Homework.Matrix;

import java.lang.reflect.Type;

public class Matrix {

    int rows;
    int columns;
    int[][] matrixArray;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.matrixArray = new int[rows][columns];
    }


    public Matrix(int rows) {
        this.rows = rows;
        this.columns = rows;
        this.matrixArray = new int[rows][rows];
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
