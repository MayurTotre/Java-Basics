package BankingApplication;

public class SavingAccount extends Account{

    private double interestRate;
    private User user;

    public SavingAccount(String branch, double balance, double interestRate, User user) {
        super(branch, balance);
        this.user = user;
        this.interestRate = interestRate;
    }



    @Override
    public void getAccountDetails() {
        System.out.println("Account number : "+getAccountNumber());
        System.out.println("Account number : "+getBalance());
        user.displayUserDetails();
    }

    @Override
    public void deposite(int amount) {

    }

    @Override
    public void withdraw(int amount) {

    }

}

