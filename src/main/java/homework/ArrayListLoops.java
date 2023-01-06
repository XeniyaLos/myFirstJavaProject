package homework;

import java.util.ArrayList;

public class ArrayListLoops {
    public static void main(String[] args) {

        // ========= Task 1 ===============
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("pear");
        fruits.add("mango");
        fruits.add("orange");
        fruits.add("grape");
        fruits.add("strawberry");
        fruits.add("raspberry");
        fruits.add("watermelon");
        fruits.add("guava");

        int k = 1;
        for(String arr : fruits){
            System.out.println(k + " fruit - " + arr);
            k++;
        }

        // ========= Task 2 ===============

        ArrayList<String> vegetables = new ArrayList<>();

        vegetables.add("potato");
        vegetables.add("cabbage");
        vegetables.add("tomato");
        vegetables.add("cucumber");
        vegetables.add("sweet pea");
        vegetables.add("corn");
        vegetables.add("carrot");
        vegetables.add("beat");
        vegetables.add("onion");
        vegetables.add("sweet potato");

        int i = 0;
        do{
            System.out.println((i + 1) + " vegetable - " + vegetables.get(i));
            i++;
        }while(i < vegetables.size());

        // ========= Task 3 ===============

        ArrayList<String> cities = new ArrayList<>();

        cities.add("Chicago");
        cities.add("Miami");
        cities.add("NY");
        cities.add("Boston");
        cities.add("Seattle");
        cities.add("Denver");
        cities.add("Madison");
        cities.add("LA");
        cities.add("San Fransisco");
        cities.add("Salt Lake City");

        int j = 0;
        while(j < cities.size()){
            System.out.println((j + 1) + " city - " + cities.get(j));
            j++;
        }

        // ========= Task 4 ===============

        ArrayList<String> foods = new ArrayList<>();

        foods.add("Bread");
        foods.add("Milk");
        foods.add("Pasta");
        foods.add("Lasagna");
        foods.add("Soup");
        foods.add("French fries");
        foods.add("Burger");
        foods.add("Plov");
        foods.add("Manty");
        foods.add("Meat pie");

        for(int a = 0; a < foods.size(); a++){
            System.out.println((a + 1) + " food - " + foods.get(a));
        }
    }
}
