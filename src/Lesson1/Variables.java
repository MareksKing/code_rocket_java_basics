package lesson1;

import java.math.BigDecimal;

public class Variables {

    public static void main(String[] args) {
        String userName = "Ruslans";
        String currency = "USD";

        BigDecimal amount = new BigDecimal(1000);
        BigDecimal bankAccount = new BigDecimal("1000.10");

        System.out.println(userName);
        System.out.println(currency);
        System.out.println(amount);
        System.out.println(bankAccount);

        BigDecimal doubleValue = new BigDecimal(1000.01);
        BigDecimal stringValueBigDecimal = new BigDecimal("1000.01");
        System.out.println(doubleValue);
        System.out.println(stringValueBigDecimal);

        boolean isHungry = true;

        double weight = 60.5;
        System.out.println(weight);

        float height = 10.5F;
        System.out.println(height);

        System.out.println(isHungry);
    }
}
