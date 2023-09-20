package oopconcept.abstraction;

public class BankUtils {

    private BankUtils(){}

    public static boolean transferBalance(Account fromAccount, Account toAccount, double balanceToBeTransferred){
        if(fromAccount.getBalance() < balanceToBeTransferred){
            return false;
        }

        fromAccount.setBalance(fromAccount.getBalance() - balanceToBeTransferred);
        toAccount.setBalance(toAccount.getBalance() + balanceToBeTransferred);

        return true;
    }
}
