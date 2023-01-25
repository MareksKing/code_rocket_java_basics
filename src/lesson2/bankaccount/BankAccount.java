package lesson2.bankaccount;

import java.math.BigDecimal;

public class BankAccount {

    private final String accountNumber;
    private final String currency;
    private final BigDecimal amount;

    public BankAccount(String accountNumber,
                       String currency,
                       BigDecimal amount) {
        this.accountNumber = accountNumber;
        this.currency = currency;
        this.amount = amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCurrency() {
        return currency;
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
