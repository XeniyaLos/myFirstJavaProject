package hashmap;

import java.util.Hashtable;

public class HashtableIntro {
    public static void main(String[] args) {

        Hashtable<String, Integer> productPrices = new Hashtable<>();
        productPrices.put("apples", 3);
        productPrices.put("sugar", 5);
        productPrices.put("pepper", 1);
        productPrices.put("avocado", 2);
        productPrices.put("chicken", 6);
        productPrices.put("oats", 10);
        productPrices.put("oat milk", 15);

        calculateTheSum(productPrices, 2);
        getProductInRange(productPrices, 2, 5);
        getProductInRange(productPrices, 1, 101);
        inRange(productPrices, 1, 100);
        inRange(productPrices, -1, 101);

    }

    public static int calculateTheSum (Hashtable<String, Integer> products, int quantity){
        int sum = 0;
        for(String key : products.keySet()){
            sum += (products.get(key)  * quantity);
        }
        System.out.println(sum);
        return sum;
    }

//    public static Hashtable<String, Integer> getProductInRange(Hashtable<String, Integer> products, int beginRange, int endRange){
//        Hashtable<String, Integer> newList = new Hashtable<>();
//        for(String key : products.keySet()){
//            if(products.get(key) >= beginRange && products.get(key) <= endRange){
//                newList.put(key, products.get(key));
//            }
//        }
//        System.out.println("Products in given range: " + newList);
//        return newList;
//    }

    public static Hashtable<String, Integer> getProductInRange(Hashtable<String, Integer> products, int beginRange, int endRange){
        Hashtable<String, Integer> newList = new Hashtable<>();

        if(beginRange < endRange && beginRange >= 0 && endRange <= 100) {

            for (String key : products.keySet()) {
                if (products.get(key) >= beginRange && products.get(key) <= endRange) {
                    newList.put(key, products.get(key));
                }
            }
            System.out.println("Products in given range: " + newList);

        }else {
            System.out.println("Sorry, incorrect range was given. Provide proper range.");

        }
        return newList;
    }

    public static Hashtable<String, Integer> inRange(Hashtable<String, Integer> products, int beginRange, int endRange){
        Hashtable<String, Integer> newList = new Hashtable<>();

        if(beginRange >= 0 && endRange <= 100){

            for(String key : products.keySet()){
                if(key.startsWith("a")){
                    newList.put(key, products.get(key));
                }
            }
            System.out.println("Products within the range and starts with 'a': " + newList);
            return newList;

        }else if(beginRange < 0 && endRange > 100){
            for(String key : products.keySet()){
                if(key.startsWith("o")){
                    newList.put(key, products.get(key));
                }
            }
            System.out.println("Products out of the range and starts with 'o': " + newList);
            return newList;
        }
//        System.out.println("Products within the range and starts with 'a': " + newList);
//        System.out.println("Products out of the range and starts with 'o': " + newList);
//        return newList;
        return null;
    }
}
