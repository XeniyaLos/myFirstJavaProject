package staticPackage;

public class Restaurant {
    public static void main(String[] args) {

    Cook cook1 = new Cook("Gordon Ramsey");
    Cook cook2 = new Cook("Salt Bae");

    cook1.washHand();
    cook2.prepareSalad();

    Cook.takeOrder("Rib eye Steak");
    System.out.println(cook2.order); // rib eye steak

     Cook.takeOrder("pasta");
     cook2.takeOrder("fettuccini");
     System.out.println(cook1.order);

    }
}
