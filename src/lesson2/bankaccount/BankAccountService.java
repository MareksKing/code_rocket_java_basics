package lesson2.bankaccount;

import java.math.BigDecimal;

public class BankAccountService {

    public void printBankAccountDetails(BankAccount bankAccount) {
        System.out.println("Account number: *************");
        System.out.println("Account currency: " + bankAccount.getCurrency());
        System.out.println("Account amount: " + bankAccount.getAmount());
    }

    public BankAccount deposit(BankAccount bankAccount, BigDecimal amountToDeposit) {
        BigDecimal currentAmount = bankAccount.getAmount();
        BigDecimal newAmount = currentAmount.add(amountToDeposit);

        return new BankAccount(bankAccount.getAccountNumber(),
                bankAccount.getCurrency(),
                newAmount);
    }

    public BankAccount withdraw(BankAccount bankAccount, BigDecimal amountToWithdraw) {
        BigDecimal currentAmount = bankAccount.getAmount();
        BigDecimal newAmount = currentAmount.subtract(amountToWithdraw);
        BankAccount newBankAccount = new BankAccount(
                bankAccount.getAccountNumber(),
                bankAccount.getCurrency(),
                newAmount
        );
        return newBankAccount;
    }
}
