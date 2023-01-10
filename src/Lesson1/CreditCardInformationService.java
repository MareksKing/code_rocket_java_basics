package Lesson1;

public class CreditCardInformationService {
    public void printCardDetails(CreditCard card){
        System.out.println(card.paymentNetwork);
        System.out.println(card.cardNumber);
        System.out.println(card.cardHolderName);
        System.out.println(card.expiryDate);
        System.out.println(card.cvv);
        System.out.println(card.blocked);
    }
}
