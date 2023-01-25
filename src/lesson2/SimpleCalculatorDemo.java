package lesson2;

public class SimpleCalculatorDemo {

    public static void main(String[] args) {
//        BAD APPROACH
//        SimpleCalculator simpleCalculator = new SimpleCalculator(20, 30);
//        System.out.println(simpleCalculator.firstNumber);
//        System.out.println(simpleCalculator.secondNumber);
//        simpleCalculator.multiplication();
//
//        simpleCalculator.firstNumber = 10;
//        simpleCalculator.secondNumber = 2;
//
//        simpleCalculator.multiplication();
//
//        simpleCalculator.firstNumber = 40;
//        simpleCalculator.secondNumber = 50;
//
//        SimpleCalculator simpleCalculator1 = new SimpleCalculator(10, 10);
//        simpleCalculator1.multiplication();
//
//        SimpleCalculator simpleCalculator2 = new SimpleCalculator(30, 30);


        SimpleCalculator simpleCalculator = new SimpleCalculator();
        var multiplicationResult = simpleCalculator.multiplication(10, 20);

    }
}
