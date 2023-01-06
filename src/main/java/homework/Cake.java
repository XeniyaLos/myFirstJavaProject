package homework;

public class Cake {

    String type;
    String color;
    String fruit;
    String topper;
    byte numberOfPeople;
    double price;
    boolean isVegan;

    public void bakeCake(String cakeType, String cakeColor, byte size, double price1, boolean vegan){
        type = cakeType;
        color = cakeColor;
        numberOfPeople = size;
        price = price1;
        isVegan = vegan;
    }

    public void display(){
        System.out.println("\nCake type: " + type);
        System.out.println("Cake color: " + color);
        System.out.println("Cake size (number of people): " + numberOfPeople);
        System.out.printf("Price for this cake: $" + "%.2f", price);
        System.out.println("\nThe cake is vegan: " + isVegan);
    }

    public void customize(String fruit1, String topper1){
        fruit = fruit1;
        topper = topper1;
        System.out.println("I also want to add " + fruit + " and a " + topper + " topper to my cake.");
    }
}

class Bakery1 {
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
