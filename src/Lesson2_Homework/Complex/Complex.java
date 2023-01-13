package Lesson2_Homework.Complex;

import java.util.Scanner;

public class Complex {

    double realNumber;
    double imaginaryNumber;
    double sum;
    double difference;
    double product;

    public void enterNumbers(){
        Scanner input = new Scanner(System.in);
        System.out.print("Input the real number of the Complex number: ");
        this.realNumber = input.nextDouble();
        System.out.print("Input the imaginary number of the Complex number: ");
        this.imaginaryNumber = input.nextDouble();
    }

    public Complex calculateSum(Complex firstNumber, Complex secondNumber){
        Complex newNumber = new Complex();
        newNumber.realNumber = firstNumber.realNumber + secondNumber.realNumber;
        newNumber.imaginaryNumber = firstNumber.imaginaryNumber + secondNumber.imaginaryNumber;
        return newNumber;
    }

    public void printComplexNumber(){
        System.out.println("(" + this.realNumber + ") + (" + this.imaginaryNumber + ")i");
    }

    public Complex calculateDifference(Complex firstNumber, Complex secondNumber){
        Complex newNumber = new Complex();
        newNumber.realNumber = firstNumber.realNumber - secondNumber.realNumber;
        newNumber.imaginaryNumber = firstNumber.imaginaryNumber - secondNumber.imaginaryNumber;
        return newNumber;
    }

    public Complex calculateProduct(Complex firstNumber, Complex secondNumber){
        Complex newNumber = new Complex();
        newNumber.realNumber = (firstNumber.realNumber * secondNumber.realNumber) - (firstNumber.imaginaryNumber * secondNumber.imaginaryNumber);
        newNumber.imaginaryNumber = (firstNumber.imaginaryNumber * secondNumber.realNumber) + (firstNumber.realNumber * secondNumber.imaginaryNumber);
        return newNumber;
    }
}
