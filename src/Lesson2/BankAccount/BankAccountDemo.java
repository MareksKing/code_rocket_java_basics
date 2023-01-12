package Lesson2.BankAccount;

import java.math.BigDecimal;

public class BankAccountDemo {

    public static void main(String[] args) {


        BankAccount bankAccount = new BankAccount("$", "9213912389123", BigDecimal.ZERO);
        BankAccountService bankAccountService = new BankAccountService();
        bankAccountService.printBankAccountDetails(bankAccount);


        bankAccount = bankAccountService.deposit(bankAccount, new BigDecimal("500.20"));
        bankAccountService.printBankAccountDetails(bankAccount);

        bankAccount = bankAccountService.withdraw(bankAccount, new BigDecimal("257.60"));
        bankAccountService.printBankAccountDetails(bankAccount);
    }

}