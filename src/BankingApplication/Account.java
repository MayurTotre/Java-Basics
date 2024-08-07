package BankingApplication;

public abstract class Account {

    private long accountNumber = 11111;
    private String branch;
    private double balance;

    public Account(String branch, double balance) {
        this.accountNumber++;
        this.branch = branch;
        this.balance = balance;
    }
    public long getAccountNumber() {
        return accountNumber;
    }

    public String getBranch() {
        return branch;
    }

    public double getBalance() {
        return balance;
    }

    public abstract void getAccountDetails();
    public abstract void deposite(int amount);
    public abstract void withdraw(int amount);


}
