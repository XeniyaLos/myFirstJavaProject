package bofaApp;

public class BofaApp {
    public static void main(String[] args) {

        BofaAccount user1 = new BofaAccount("Anna D", "+1(630)330-4565", "codewise@gmail.com");

        user1.addMoney(5000);
        user1.displayInfo();
        user1.sendMoney(200, "220-32-32");
        user1.displayInfo();
        user1.sendMoney(1200, "435-7678");
        user1.sendMoney(5000, "4654564");

        BofaAccount user2 = new BofaAccount("James Kameron", "345-56-234", "jk@gmail.com");
        user2.displayInfo();
        user2.addMoney(1000);
        user2.displayInfo();

        BofaAccount.bankInfo();
    }
}
