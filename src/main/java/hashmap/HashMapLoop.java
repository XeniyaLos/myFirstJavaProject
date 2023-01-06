package hashmap;

import java.util.Arrays;
import java.util.HashMap;

public class HashMapLoop {
    public static void main(String[] args) {

        HashMap<String, Integer> ages = new HashMap<>();
        ages.put("Rahul", 30);
        ages.put("Patel", 40);
        ages.put("Chitra", 32);
        ages.put("Deepak", 12);
        ages.put("Suresh", 50);

        // === get all values and print it =====
        for (String name : ages.keySet()) {
            System.out.println(ages.get(name));
        }

        // === print keys =======
        for (String name : ages.keySet()) {
            System.out.println(name);
        }

        String userName1 = "";
        int age1 = 0;
        for (String name : ages.keySet()) {
            if (name.equals("Rahul")) {
                userName1 = name;
                age1 = ages.get(name);
            }
        }
        System.out.println("\n" + userName1 + " " + age1);

        String userName2 = "";
        int age2 = 0;
        for (String name : ages.keySet()) {
            if (name.equals("Suresh")) {
                userName2 = name;
                age2 = ages.get(name);
            }
        }
        System.out.println(userName2 + " " + age2);

        // ======= Create array of names
        String [] names = new String[ages.keySet().size()];

        int i = 0;
        for(String name : ages.keySet()){
            names[i] = name;
            i++;
        }
        System.out.println(Arrays.toString(names));

        int[] ageArr = new int[ages.keySet().size()];

        int j = 0;
        for(String age : ages.keySet()){
            ageArr[j] = ages.get(age);
            j++;
        }
        System.out.println(Arrays.toString(ageArr));

        System.out.println("Just printing the hashmap itself: " + ages);
        System.out.println("Printing the entry set of the hashmap: " + ages.entrySet());

        HashMap<String, String> fruitsAndVegetables = new HashMap<>();
        fruitsAndVegetables.put("apple", "fruit");
        fruitsAndVegetables.put("carrot", "vegetable");
        fruitsAndVegetables.put("orange", "fruit");
        fruitsAndVegetables.put("cabbage", "vegetable");


        for(String fruits : fruitsAndVegetables.keySet()){
            if(fruitsAndVegetables.get(fruits).equals("fruit")){
                System.out.println("fruits: " + fruits);
            }
        }

        for(String vegetable : fruitsAndVegetables.keySet()){
            if(fruitsAndVegetables.get(vegetable).equals("vegetable")){
                System.out.println("vegetable: " + vegetable);
            }
        }

        // =====================

        HashMap<String, String> words = new HashMap<>();
        words.put("window", "house");
        words.put("brick", "house");
        words.put("rain", "nature");
        words.put("water", "swimming");
        words.put("association", "organization");
        words.put("software", "system");

        for(String key : words.keySet()){
            if(words.get(key).length() <= 5){
                System.out.println("value length <= 5: " + words.get(key));
            }
        }

        for(String key : words.keySet()){
            if(words.get(key).length() >= 7){
                System.out.println("value length >= 7: " + words.get(key));
            }
        }
    // =========== keys =============
        for(String key : words.keySet()){
            if(key.startsWith("a") || key.startsWith("b") || key.startsWith("c")){
                System.out.println("key starts with 'a' or 'b' or 'c': " + key);
            }
            if(key.endsWith("e") || key.endsWith("o")){
                System.out.println("ends with 'e' or 'o': " + key);
            }
        }
    }
}
