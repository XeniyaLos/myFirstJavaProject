package stringManipulation;

public class Trim {
    public static void main(String[] args) {

        String shop = " Amazon ";
        System.out.println(shop);
        System.out.println(shop.trim());

        String anotherShop = "      Whole Foods      ";
        System.out.println(anotherShop);
        System.out.println(anotherShop.length());

        System.out.println(anotherShop);
        anotherShop = anotherShop.trim();
        System.out.println(anotherShop.length());
        System.out.println(anotherShop);

        String shop3 = "  M  arianos    shop";
        shop3 = shop3.trim();
        System.out.println(shop3);
    }
}
