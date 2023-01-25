package lesson2;

public class SimpleCalculator {


    public int multiplication(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public void printMultiplicationResult(int firstNumber, int secondNumber) {
        int result = multiplication(firstNumber, secondNumber);
        System.out.println("Multiplication result: " + result);
    }
}
