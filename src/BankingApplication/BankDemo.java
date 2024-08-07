package BankingApplication;

import java.util.ArrayList;
import java.util.List;

public class BankDemo {

    private List<Account> accounts;
    private List<User> users;

    public BankDemo() {
        this.accounts = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    public void addAccounts(Account account){
        accounts.add(account);
    }

    public void addUsers(User u ){
        users.add(u);
    }
    public void getAllAccount() {
        for (Account a : accounts) {
            a.getAccountDetails();
        }
    }


    public void getAllUserDetils(){
        for (User u : users) {
            u.displayUserDetails();
        }
    }


}

