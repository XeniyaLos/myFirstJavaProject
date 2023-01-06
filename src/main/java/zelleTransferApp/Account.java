package zelleTransferApp;

import java.util.ArrayList;

public class Account {
    ArrayList<ZelleAccount> accounts = new ArrayList<>();



    public void addAccount(ZelleAccount account) {

        accounts.add(account);
    }

    public void transferMoney(ZelleAccount fromUser, ZelleAccount toUser, Double transferAmount){


       /* if(fromUser.getBalance() >= transferAmount) {
            System.out.println("\nAmount: " + transferAmount + " is successfully transferred to " + toUser.getPhoneNumber());
            fromUser.setBalance(fromUser.getBalance() - transferAmount);
            toUser.setBalance(toUser.getBalance() + transferAmount);
        }else{
            System.out.println("Insufficient funds. Transfer failed.");
        }

        */

    }
}
