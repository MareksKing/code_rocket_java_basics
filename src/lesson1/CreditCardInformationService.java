package lesson1;

public class CreditCardInformationService {

    public void printCardDetails(CreditCard creditCard) {
        System.out.println(creditCard.paymentNetwork);
        System.out.println(creditCard.cardNumber);
        System.out.println(creditCard.cardHolderName);
        System.out.println(creditCard.cvv);
        System.out.println(creditCard.expiryDate);
        System.out.println(creditCard.blocked);
    }
}
