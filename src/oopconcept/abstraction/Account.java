package oopconcept.abstraction;

public class Account {

    private String accountNumber;
    private String accountName;
    private String socialSecurityNumber;
    private String exposedSocialSecurityNumber;
    private double balance;

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
        this.exposedSocialSecurityNumber = socialSecurityNumber.substring(socialSecurityNumber.length()-4);
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getExposedSocialSecurityNumber() {
        return exposedSocialSecurityNumber;
    }

    public double getBalance() {
        return balance;
    }
}
