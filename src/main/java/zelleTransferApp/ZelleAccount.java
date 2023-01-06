package zelleTransferApp;

import java.util.ArrayList;

public class ZelleAccount {

    String fullName;
    String phoneNumber;
    double balance;
    String address;
    String bankName;

    static int totalUsers;
    static double totalMoney;

    static ArrayList<ZelleAccount> userList = new ArrayList<>();

    public ZelleAccount(String fullName, String phoneNumber, String bankName){
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.bankName = bankName;
        totalUsers++;
    }

    public ZelleAccount(String fullName, String phoneNumber){
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        userList.add(this);
        totalUsers++;

    }

    public void depositMoney(double depositAmount){
        System.out.println("\nMoney deposited successfully");
        this.balance += depositAmount;
        totalMoney += depositAmount;
    }

    public void transferMoney(String phoneNumber, double transferAmount){
        if(this.balance >= transferAmount){
            System.out.println("\nAmount: " + transferAmount + " is successfully transferred to " + phoneNumber);
            this.balance -= transferAmount;
        }else {
            System.out.println("Insufficient funds. Transfer failed.");
        }
    }

    public String getPhoneNumber() {
        //this.phoneNumber.trim().replaceAll("-", "").replaceAll(" ", "");
        return this.phoneNumber;
    }

    public String getFullName() {
        return this.fullName;
    }


    //ZelleAccount user = dataSnapshot.getValue(ZelleAccount.class);
    public void transferMoneyUpdated(String phoneNumber, double transferAmount){
        //phoneNumber.trim().replaceAll("-", "").replaceAll(" ", "");
        for(int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getPhoneNumber().equals(phoneNumber)) {
                if (this.balance >= transferAmount) {
                    System.out.println("\nUser: " + userList.get(i).getFullName() + " is registered with Zelle.");
                    System.out.println("Amount: " + transferAmount + " was successfully transferred to " + phoneNumber);
                    this.balance -= transferAmount;
                    break;
                } else {
                    System.out.println("Insufficient funds. Transfer failed.");
                    break;
                }
            }
        }
        //if(!userList.contains(phoneNumber)) {
            System.out.println("User with: " + phoneNumber + " is not registered with Zelle.");

    }



    public void info(){
        System.out.println("\nAccount details:");
        System.out.println("Name: " + this.fullName);
        System.out.println("Balance: " + this.balance);
        System.out.println("Bank: " + this.bankName);
        System.out.println("Phone number: " + this.phoneNumber);
    }

    public static void customerService(){
        System.out.println("\nCall 888-777-2323 for customer service");
    }

    public static void zelleInfo(){
        System.out.println("\nTotal Zelle users: "+ totalUsers);
        System.out.println("Total money on the platform: "+ totalMoney);
    }
}
