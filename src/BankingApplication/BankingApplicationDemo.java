package BankingApplication;

public class BankingApplicationDemo {

    public static void main(String[] args) {

        User user1 = new User("Mayur",26, 8765);
        User user2= new User("Mayur",26, 8765);
        User user3 = new User("Mayur",26, 8765);
        User user4 = new User("Mayur",26, 8765);

        Account account1 = new SavingAccount("MUmbai",5000,5.5,user1);
        Account account4 = new SavingAccount("MUmbai",5000,5.5,user2);
        Account account2 = new SavingAccount("MUmbai",5000,5.5,user3);
        Account account3 = new SavingAccount("MUmbai",5000,5.5,user4);

        Account[] arrAccount = {account1,account2,account3,account4};

        BankDemo bank = new BankDemo();

        for (Account a : arrAccount){
            bank.addAccounts(a);
        }

        bank.getAllAccount();
        bank.getAllUserDetils();

        account1.getAccountDetails();




    }

}
