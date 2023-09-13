package oopconcept.abstraction;

public class AbstractionUseCase {

    public static void main(String[] args) {

        Account accountA = new Account();
        accountA.setAccountName("A");
        accountA.setAccountNumber("325869345");
        accountA.setSocialSecurityNumber("123456789");
        accountA.setBalance(5000);

        Account accountB = new Account();
        accountB.setAccountName("B");
        accountB.setAccountNumber("325869355");
        accountB.setSocialSecurityNumber("987654321");
        accountB.setBalance(1000);

        BankUtils bankUtils = new BankUtils();
        bankUtils.transferBalance(accountA, accountB, 500);
        bankUtils.transferBalance(accountB, accountA, 500);
        bankUtils.transferBalance(accountA, accountB, 1000);

    }
}
