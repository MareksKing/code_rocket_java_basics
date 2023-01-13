package Lesson2_Homework.Complex;

public class ComplexDemo {
    public static void main(String[] args) {

        Complex firstNumber = new Complex();
        Complex secondNumber = new Complex();
        Complex newNumber = new Complex();

        firstNumber.enterNumbers();
        secondNumber.enterNumbers();
        newNumber=newNumber.calculateSum(firstNumber, secondNumber);
        newNumber.printComplexNumber();

        newNumber=newNumber.calculateDifference(firstNumber, secondNumber);
        newNumber.printComplexNumber();

        newNumber=newNumber.calculateProduct(firstNumber, secondNumber);
        newNumber.printComplexNumber();
    }
}
