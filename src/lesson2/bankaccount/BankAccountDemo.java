package lesson2.bankaccount;

import java.math.BigDecimal;

public class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(
                "123124124123",
                "EUR",
                BigDecimal.ZERO
        );
        BankAccountService bankAccountService = new BankAccountService();

        bankAccountService.printBankAccountDetails(bankAccount);
        System.out.println("--------");

        bankAccount = bankAccountService.deposit(bankAccount, new BigDecimal("10000"));

        bankAccountService.printBankAccountDetails(bankAccount);

        bankAccount = bankAccountService.withdraw(bankAccount, new BigDecimal("4000"));

        bankAccountService.printBankAccountDetails(bankAccount);
    }
}
