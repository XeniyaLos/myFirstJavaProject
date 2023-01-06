package homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IsEmptyArray {
    public static void main(String[] args) {

        // ========= TASK 1 ===============
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Chicago");
        cities.add("Miami");
        cities.add("LA");
        cities.add("NY");
        cities.add("Madison");

        boolean isEmpty = cities.isEmpty();
        System.out.println(isEmpty);

        cities.clear();
        isEmpty = cities.isEmpty();
        System.out.println(isEmpty);

        // ========= TASK 2 ===============
        String[] fruits = {"apple", "banana", "pear", "orange", "grape"};

            if(fruits.length == 0){
                System.out.println("Array is empty");
            }else {
                System.out.println("Array is not empty");
            }

        List<String> fruitList = new ArrayList<String>(fruits.length);
            for(String i : fruits){
                fruitList.add(i);
            }
        System.out.println(fruitList);
        System.out.println("size: " + fruitList.size());

        boolean isEmpty2 = fruitList.isEmpty();
        System.out.println("array before removal empty: " + isEmpty2);


        fruitList.clear();
        System.out.println("size: " + fruitList.size());
        isEmpty2 = fruitList.isEmpty();
        System.out.println("array after removal empty: " + isEmpty2);

    }
}
