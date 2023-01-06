package hashmap;

import java.util.HashMap;

public class HashMapIntro {
    public static void main(String[] args) {

        HashMap<String, String> antonyms = new HashMap<>();
        antonyms.put("cold", "hot");
        antonyms.put("long", "short");
        antonyms.put("hard", "soft");
        antonyms.put(null, "no data");
        antonyms.put("table", null);
        antonyms.put("screen", null);

        System.out.println(antonyms);
        System.out.println(antonyms.get("hard")); // soft
        System.out.println(antonyms.get(null)); // no data
        System.out.println(antonyms.get("table")); // null

        HashMap<String, Double> productPrice = new HashMap<>();
        productPrice.put("Milk", 8.99);
        productPrice.put("Bread", 3.99);
        productPrice.put("Yogurt", 5.99);
        productPrice.put("Potato", 3.99);
        productPrice.put("Pizza", 12.99);

        System.out.println(productPrice);
        System.out.println(productPrice.get("Milk"));
        System.out.println(productPrice.get("Bread"));
        System.out.println(productPrice.size());


        HashMap<String, String> fullName = new HashMap<>();
        fullName.put("John", "no lastname");
        fullName.put("Kate", null);
        fullName.put(null, "Johnson");
        fullName.put("Brad", "Pitt");
        fullName.put("Ann", null);

        System.out.println(fullName);
        System.out.println(fullName.get("John"));
        System.out.println(fullName.get("Kate"));
        System.out.println(fullName.size());

        HashMap<String, Byte> numbers = new HashMap<>();
        numbers.put("ONE", (byte)1);
        numbers.put("TWO", (byte)2);
        numbers.put("THREE", (byte)3);
        numbers.put("FOUR", (byte)4);
        numbers.put("FIVE", (byte)5);

        System.out.println(numbers.get("ONE"));

        //=============================

        HashMap<Integer, Integer> decimals = new HashMap<>();
        decimals.put(1, 100);
        decimals.put(2, 200);
        decimals.put(3, 300);
        decimals.put(4, 400);
        decimals.put(5, 500);
        decimals.put(6, 600);
        decimals.put(7, 700);
        decimals.put(8, 800);
        decimals.put(9, 900);
        decimals.put(10, 1000);

        System.out.println(decimals.get(1));
        System.out.println(decimals.containsKey(2)); // true
        System.out.println("decimals: " + decimals);
        System.out.println("size: " + decimals.size());

        decimals.remove(2);
        System.out.println("decimals: " + decimals);
        System.out.println("size after removal: " + decimals.size());

        decimals.clear();
        System.out.println(decimals);

        // ===============

        HashMap<Double, Integer> nums = new HashMap<>();
        nums.put(1.99, 1);
        nums.put(2.99, 2);
        nums.put(3.99, 3);
        nums.put(4.99, 4);
        nums.put(5.99, 5);

        System.out.println(nums);

        HashMap<Integer, String> orders = new HashMap<>();
        orders.put(4, "four");
        orders.put(10, "ten");
        orders.put(1343, "sfssf");
        orders.put(5, "five");
        orders.put(-12, "minus");

        System.out.println("orders: " + orders);
    }
}
