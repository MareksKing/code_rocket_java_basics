package Lesson3_Homework;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first floating number:");
        float firstNumber = scanner.nextFloat();
        System.out.print("Input the second floating number:");
        float secondNumber = scanner.nextFloat();

        String[] firstNumberDecimal = Float.toString(firstNumber).split("\\.");
        String[] secondNumberDecimal = Float.toString(secondNumber).split("\\.");
        float firstNumberDecimalPoint = Float.parseFloat(String.valueOf(firstNumberDecimal[1]));
        float secondNumberDecimalPoint = Float.parseFloat(String.valueOf(secondNumberDecimal[1]));

        if(firstNumberDecimal[0].equals(secondNumberDecimal[0])){

            if(Float.compare(firstNumberDecimalPoint, secondNumberDecimalPoint) == 0){
                System.out.println("Numbers are equal");
            }else if(Float.compare(firstNumberDecimalPoint, secondNumberDecimalPoint) > 0){
                if(Math.abs(firstNumberDecimalPoint - secondNumberDecimalPoint) <= 3){
                    System.out.println("Numbers are basically the same");
                }
            }else{
                if(Math.abs(secondNumberDecimalPoint - firstNumberDecimalPoint) <= 3){
                    System.out.println("Numbers are basically the same");
                }
            }
        }else{
            System.out.println("Numbers are not equal");
        }
    }
}
