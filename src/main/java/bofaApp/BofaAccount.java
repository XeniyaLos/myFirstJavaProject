package bofaApp;

public class BofaAccount {

    String fullName;
    String phoneNumber;
    String address;
    double accountBalance;
    boolean isPersonal;
    String email;

    static int totalUsers;
    static double totalBankMoney;


    public BofaAccount(String fullName, String phoneNumber, String email){
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        totalUsers++;
    }

    public void addMoney(double money){
        this.accountBalance += money;
        totalBankMoney += money;
        System.out.println("Now in you account: " + this.accountBalance);
    }

    public void sendMoney(double money, String phoneNumber){
        if(this.accountBalance >= money && money <= 1000){
            System.out.println(this.fullName + " transfers: " + money + " was successfully made to: " + phoneNumber);
            this.accountBalance -= money;
            totalBankMoney -= money;
        }else if(this.accountBalance >= money && money > 1000){
            System.out.println("Transfer limit is exceeded.");
        }else {
            System.out.println("Insufficient funds. Transfer failed.");
        }
    }

    public void displayInfo(){
        System.out.println("\nName: " + this.fullName);
        System.out.println("Phone number: " + this.phoneNumber);
        System.out.println("Account balance: " + this.accountBalance);
        System.out.println("Email: " + this.email);
    }

    public static void bankInfo(){
        System.out.println("Users: " + totalUsers);
        System.out.println("Total amount deposited to bank: " + totalBankMoney);
    }


}
