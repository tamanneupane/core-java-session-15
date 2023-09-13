package oopconcept.abstraction;

public class BankUtils {

    public boolean transferBalance(Account fromAccount, Account toAccount, double balanceToBeTransferred){
        if(fromAccount.getBalance() < balanceToBeTransferred){
            return false;
        }

        fromAccount.setBalance(fromAccount.getBalance() - balanceToBeTransferred);
        toAccount.setBalance(toAccount.getBalance() + balanceToBeTransferred);

        return true;
    }
}
