package lesson2.bankaccount2;

import java.math.BigDecimal;

public class BankAccount {

    private String accountNumber;
    private String currency;
    private BigDecimal amount;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void deposit(BigDecimal amountToDeposit) {
        amount = amount.add(amountToDeposit);
    }

    public void withdraw(BigDecimal amountToWithdraw) {
        amount = amount.subtract(amountToWithdraw);
    }
}
