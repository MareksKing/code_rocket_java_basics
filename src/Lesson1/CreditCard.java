package Lesson1;


import java.util.Date;

public class CreditCard {
    String paymentNetwork;
    String cardNumber;
    String cardHolderName;
    String cvv;
    Date expiryDate;
    boolean blocked;

    public CreditCard(String paymentNetwork, String cardNumber, String cardHolderName, String cvv, Date expiryDate) {
        this.paymentNetwork = paymentNetwork;
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }

    public CreditCard() {}

    @Override
    public String toString() {
        return "CreditCard{" +
                "paymentNetwork='" + paymentNetwork + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", cardHolderName='" + cardHolderName + '\'' +
                ", cvv='" + cvv + '\'' +
                ", expiryDate=" + expiryDate +
                ", blocked=" + blocked +
                '}';
    }
}
