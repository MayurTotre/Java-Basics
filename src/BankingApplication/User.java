package BankingApplication;

public class User {

    private String userName;
    private int age;
    private long contactNo;

    public User(String userName, int age, long contactNo) {
        this.userName = userName;
        this.age = age;
        this.contactNo = contactNo;
    }

    public String getUserName() {
        return userName;
    }

    public int getAge() {
        return age;
    }

    public long getContactNo() {
        return contactNo;
    }

    public void displayUserDetails(){
        System.out.println("User{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                ", contactNo=" + contactNo +
                '}');
    }
}
