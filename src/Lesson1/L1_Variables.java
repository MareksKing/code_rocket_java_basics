package Lesson1;

import java.math.BigDecimal;

public class L1_Variables {
    public static void main(String[] args){

        String userName = "Mareks";
        String currency = "EUR";
        BigDecimal amount = new BigDecimal(1000);
        BigDecimal bankAccount = new BigDecimal("1000.10");

        System.out.println(userName);
        System.out.println(currency);
        System.out.println(amount);
        System.out.println(bankAccount);

        BigDecimal doubleValue = new BigDecimal(1000.01);
        System.out.println(doubleValue); //Floating point

        BigDecimal stringValueBigDecimal = new BigDecimal("1000.01");
        System.out.println(stringValueBigDecimal);

        boolean isHungry = true;

        double weight = 98.9;
        System.out.println(weight);

        float height = (float) 179.5; // or 179.5F
        System.out.println(height);

    }
}
