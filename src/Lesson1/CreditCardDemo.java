package Lesson1;

import java.sql.SQLOutput;
import java.util.Date;

public class CreditCardDemo {
    public static void main(String[] args) {
        CreditCard firstCreditCard = new CreditCard();
        Date expiryDate = new Date();
        CreditCardInformationService informationService = new CreditCardInformationService();
        CreditCard secondCreditCard = new CreditCard("MASTERCARD", "5573 6820 0159 9968", "Mareks Robalds", "111", expiryDate);
        System.out.println(firstCreditCard.paymentNetwork);
        System.out.println(firstCreditCard.cardNumber);
        System.out.println(firstCreditCard.cardHolderName);
        System.out.println(firstCreditCard.expiryDate);
        System.out.println(firstCreditCard.cvv);
        System.out.println(firstCreditCard.blocked);

        firstCreditCard.paymentNetwork = "MASTERCARD";

        System.out.println(firstCreditCard.paymentNetwork);

        System.out.println(secondCreditCard.paymentNetwork);
        System.out.println(secondCreditCard.cardNumber);
        System.out.println(secondCreditCard.cardHolderName);
        System.out.println(secondCreditCard.expiryDate);
        System.out.println(secondCreditCard.cvv);
        System.out.println(secondCreditCard.blocked);

        CreditCardBlockingService blockingService = new CreditCardBlockingService();
        blockingService.blockCreditCard(firstCreditCard);
        informationService.printCardDetails(firstCreditCard);


    }
}
