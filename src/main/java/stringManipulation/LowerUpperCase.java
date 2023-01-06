package stringManipulation;

public class LowerUpperCase {
    public static void main(String[] args) {

        String shop1 = "Amazon";
        String shop2 = "amazon";

        boolean isSame;

        isSame = shop1.equals(shop2);
        System.out.println("Amazon is same as amazon: " + isSame); // false

        shop1 = shop1.toLowerCase(); // Amazon --> amazon
        isSame = shop1.equals(shop2);
        System.out.println("amazon is same as amazon: " + isSame); // true


        String car1 = "MERCEDES";
        String car2 = "Rolls Royce";
        String car3 = "MercedeS";
        String car4 = "rolls royce";

        isSame = car1.equals(car3.toUpperCase());
        System.out.println(isSame); //true
        System.out.println("car1: " + car1);
        System.out.println("car2: " + car2);
        System.out.println("car3: " + car3);
        System.out.println("car4: " + car4);
        car3 = car3.toUpperCase(); // now car3 is Upper Case
        System.out.println(car3);
        System.out.println(car3 + " " + car1);
        System.out.println(car1 == car3);

        car1 = car1.toLowerCase();
        car3 = car3.toLowerCase();
        System.out.println(car3 + " " + car1);

        System.out.println("RoLLs RoyCe".equals(car4)); // false
        System.out.println("RoLLs RoyCe".toLowerCase().equals(car4)); // true

        System.out.println("ChiCaGo".equals("chIcagO"));
        System.out.println("ChiCaGo".toUpperCase().equals("chIcagO".toUpperCase())); // true

        // ===== equalsIgnoreCase() ==== //

        System.out.println("ChiCaGo".equals("chIcagO")); // false
        System.out.println("ChiCaGo".equalsIgnoreCase("chIcagO")); //true

        String person1 = "Brad Pitt";
        String person2 = "Brad pitt";

        boolean isPitt = person2.equals(person1);
        System.out.println("isPitt: " + isPitt); // false

        isPitt = person2.equalsIgnoreCase(person1);
        System.out.println("isPitt: " + isPitt); // true

        isPitt = person2.equals(person1.toUpperCase());
        System.out.println("isPitt: " + isPitt); // false

        isPitt = person2.toLowerCase().equalsIgnoreCase(person1.toUpperCase());
        System.out.println("isPitt: " + isPitt); // true


    }
}
