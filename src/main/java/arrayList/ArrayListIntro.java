package arrayList;

import java.util.ArrayList;

public class ArrayListIntro {
    public static void main(String[] args) {

        ArrayList<String> groceryList = new ArrayList<>();
        groceryList.add("Milk");
        groceryList.add("Bread");
        groceryList.add("Apples");

        System.out.println(groceryList); // [Milk, Bread, Apples]

        System.out.println(groceryList.get(1)); // Bread

        groceryList.add("Ice cream");
        groceryList.add("Peanut butter");

        System.out.println(groceryList);

        // ================================

        ArrayList<String> toDoList = new ArrayList<>();
        toDoList.add("Get job as SDET");
        toDoList.add("Travel to new countries");
        toDoList.add("Visit relatives");
        toDoList.add("Buy a house");
        toDoList.add("Eat lots of ice cream");
        toDoList.add("Watch movies");

        System.out.println(toDoList);

        for(int i = 0; i < toDoList.size(); i++){
            System.out.println(toDoList.get(i) + " - DONE");
        }

        ArrayList<String> cars = new ArrayList<>();
        cars.add("Moserati");
        cars.add("Lamborgini");
        cars.add("Porche");
        cars.add("Mazda");
        cars.add("Bugatti");

        cars.set(3, "Ferrari");
        System.out.println(cars);

        cars.set(0, "Mercedes");
        System.out.println(cars);

        cars.set(4, "Aston Martin");
        System.out.println(cars);

        System.out.println("Size: " + cars.size());
        System.out.println(cars.get(1));

        cars.remove(0); // -> remove first element
        System.out.println(cars);

        System.out.println(cars.get(0));

        cars.remove(2);
        System.out.println(cars.size());

        cars.add(3, "Ferrari");
        cars.add(0, "Mozerati");
        System.out.println(cars);

        System.out.println(cars.size()); // 5

        for(int i = 0; i < cars.size(); i++){
            if(cars.get(i).equals("Ferrari")){
                System.out.println(cars.get(i));
            }
        }

        cars.clear();
        System.out.println(cars.size()); // 0

    }
}
