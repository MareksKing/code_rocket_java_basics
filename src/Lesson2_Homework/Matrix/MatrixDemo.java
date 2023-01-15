package Lesson2_Homework.Matrix;


public class MatrixDemo {
    public static void main(String[] args) {
        Matrix firstMatrix = new Matrix(3, 3);
        Matrix secondMatrix = new Matrix(3, 3);
        Matrix newMatrix = new Matrix();
        MatrixService matrixService = new MatrixService();

        matrixService.insertValues(firstMatrix);
        matrixService.insertValues(secondMatrix);
        newMatrix = matrixService.additionMatrix(firstMatrix, secondMatrix);
        
        System.out.println(matrixService.printMatrix(firstMatrix)); 
        System.out.println(matrixService.printMatrix(secondMatrix)); 
        System.out.println(matrixService.printMatrix(newMatrix)); 
        newMatrix = matrixService.multiplyMatrix(firstMatrix, secondMatrix);
        System.out.println(matrixService.printMatrix(newMatrix));
    
    }
}
