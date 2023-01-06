package homework;

public class Bakery {
    public static void main(String[] args) {

        Cake napoleon = new Cake();
        Cake honeyCake = new Cake();
        Cake biscuit = new Cake();

        napoleon.bakeCake("Napoleon", "white", (byte) 12, 50, false);
        napoleon.display();
        napoleon.customize("strawberries and rasperries", "Happy Birthday");

        honeyCake.bakeCake("Honey Cake", "yellow", (byte) 24, 45.50, true);
        honeyCake.display();
        honeyCake.customize("blueberries", "Baby Shower");

        biscuit.bakeCake("Bicuit Cake", "pink", (byte) 64, 200, false);
        biscuit.display();
        biscuit.customize("kiwi and prunes", "Happy Anniversary");
    }
}
