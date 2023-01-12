package Lesson2.BankAccount;

import java.math.BigDecimal;

public class BankAccount {

    private final String currency;
    private final String accountNumber;
    private final BigDecimal amount;

    public BankAccount(String currency, String accountNumber, BigDecimal amount) {
        this.currency = currency;
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
