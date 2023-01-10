package Lesson1;

public class SimpleCalculatorDemo {
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();

        System.out.println(calculator);

        int calculationResult = calculator.addition(2, 2);
        System.out.println(calculationResult);
    }
}
