package lesson1;

public class SimpleCalculatorDemo {

    public static void main(String[] args) {
        SimpleCalculator simpleCalculator = new SimpleCalculator();

        int a = 10;
        int b = 20;

        int c = a + b;

        int calculationResult = simpleCalculator.addition(a, b);

        System.out.println(calculationResult);

        int firstNumber = 123;
        int secondNumber = 231314;

        int thirdNumber = simpleCalculator.addition(firstNumber, secondNumber);
        System.out.println(thirdNumber);
    }
}
