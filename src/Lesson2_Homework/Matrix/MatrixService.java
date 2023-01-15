package Lesson2_Homework.Matrix;

import java.util.Scanner;

public class MatrixService {
    
    public void insertValues(Matrix matrix) {
        for (int i = 0; i < matrix.getRows(); i++) {
            for (int j = 0; j < matrix.getColumns(); j++) {
                Scanner input = new Scanner(System.in);
                System.out.print("Matrix value at: " + i + "; " + j + ": ");
                matrix.matrixArray[i][j] = input.nextInt();
                input.close();
            }
            
        }
        
    }

    public void insertValue(Matrix matrix, int row, int column, int value) {
        matrix.matrixArray[row][column] = value;
    }

    
    public String printMatrix(Matrix matrix) {
        String outputString = "";
        for (int row = 0; row < matrix.matrixArray.length; row++) {
            outputString += "[";
            for (int column = 0; column < matrix.matrixArray[row].length; column++) {
                outputString += " " + matrix.matrixArray[row][column];
            }
            outputString += " ]\n";
        }
        return outputString;
    }

    public Matrix additionMatrix(Matrix firstMatrix, Matrix secondMatrix){
        Matrix newMatrix = new Matrix(firstMatrix.getRows(), firstMatrix.getColumns());
        for (int i = 0; i < firstMatrix.getRows(); i++) {
            for (int j = 0; j < firstMatrix.getColumns(); j++) {
                newMatrix.matrixArray[i][j] = firstMatrix.matrixArray[i][j] + secondMatrix.matrixArray[i][j];
            }
        }

        return newMatrix;
    }

    public Matrix multiplyMatrix(Matrix firstMatrix, Matrix secondMatrix){
        Matrix newMatrix = new Matrix(firstMatrix.getRows(), secondMatrix.getColumns());
        for (int i = 0; i < firstMatrix.getRows(); i++) {
            for (int j = 0; j < secondMatrix.getColumns(); j++) {
                newMatrix.matrixArray[i][j] = 0;
                for (int k = 0; k < secondMatrix.getColumns(); k++) {
                    newMatrix.matrixArray[i][j] += firstMatrix.matrixArray[i][k] * secondMatrix.matrixArray[k][j]; 
                }
            }
        }
        
        return newMatrix;
    }
}
