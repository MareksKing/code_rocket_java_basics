package Lesson2.BankAccount;

import java.math.BigDecimal;

public class BankAccountService {

    public void printBankAccountDetails(BankAccount bankAccount){
        System.out.println("Account number: " + bankAccount.getAccountNumber());
        System.out.println("Currency: " + bankAccount.getCurrency());
        System.out.println("Amount: " + bankAccount.getAmount());
    }

    public BankAccount deposit(BankAccount account, BigDecimal amountToDeposit){
        BigDecimal newDeposit = account.getAmount().add(amountToDeposit);
        BankAccount newBankAccount = new BankAccount(account.getCurrency(), account.getAccountNumber(), newDeposit);
        return newBankAccount;
    }

    public BankAccount withdraw(BankAccount account, BigDecimal amountToWithdraw){
        BigDecimal newWithdraw = account.getAmount().subtract(amountToWithdraw);
        BankAccount newBankAccount = new BankAccount(account.getCurrency(), account.getAccountNumber(), newWithdraw);

        return newBankAccount;
    }
}
