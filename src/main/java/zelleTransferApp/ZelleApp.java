package zelleTransferApp;

public class ZelleApp {
    public static void main(String[] args) {

        ZelleAccount user1 = new ZelleAccount("James Bond", "773-773-8888", "Chase");
        user1.depositMoney(2000);
        user1.info();

        user1.info();


        ZelleAccount user2 = new ZelleAccount("Kate Smith", "630-773-8856", "Bank of America");
        user2.depositMoney(5000);
        user2.info();
        System.out.println();

        System.out.println("Total users: " + ZelleAccount.totalUsers);
        System.out.println("Zelle account total money: " + ZelleAccount.totalMoney);

        ZelleAccount.zelleInfo();
        ZelleAccount.customerService();

        ZelleAccount user3 = new ZelleAccount("Ksu", "630-220-8228");
        ZelleAccount user4 = new ZelleAccount("Alex", "630-330-8228");
        ZelleAccount user5 = new ZelleAccount("Kate", "630-440-8228");

        ZelleAccount.zelleInfo();
        user3.depositMoney(2000);
        user3.info();

        user5.info();
        user2.transferMoneyUpdated("630-440-8228", 2000);
        user2.info();

        //user3.depositMoney(2000);
        //user3.transferMoneyUpdated("630-440-8228", 200);

    }
}
