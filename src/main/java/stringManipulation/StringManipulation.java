package stringManipulation;

import classesAndObjects.Animal;
import classesAndObjects.Zoo;

public class StringManipulation {
    public static void main(String[] args) {

        String name = "John";
        String name2 = "Johnson";

        boolean isEqual = name == name2; // we catch the value here
        System.out.println(isEqual); // false

        String city = "Chicago";
        String city2 = "Miami";
        isEqual = city == city2;
        System.out.println(isEqual); // false

        String newCity = new String("Chicago");
        isEqual = city == newCity;
        System.out.println("Chicago == newChicago: " + isEqual); // false coz we used keyword 'new'. They live in 2 different objects


        Animal elephant = new Animal();
        System.out.println(elephant); // it will print out the ID of this class

        // ------------ //

         String cake1 = "honeycake";
         String cake2 = "cheesecake";
         String cake3 = "Honeycake";
         String cake4 = "cheesecake";
         String cake5 = new String("cheesecake");

         boolean isSameCake = cake1 == cake2;
        System.out.println("honeycake == cheesecake: " + isSameCake); // false

        isSameCake = cake1 == cake3;
        System.out.println("honeycake == Honeycake: " + isSameCake); // false

        isSameCake = cake2 == cake4;
        System.out.println("cheesecake == cheesecake: " + isSameCake); // true

        isSameCake = cake4 == cake5;
        System.out.println(isSameCake); // false - we are comparing new objects now, not the values

        //===== equals() method from String class ===== //

        isSameCake = cake4.equals(cake5); // true
        System.out.println(isSameCake);

        System.out.println("USA".equals("USA")); // ture - it compares only value

        String animal = "elephant";
        System.out.println(animal.equals("animal")); // false

        String animal2 = "lion";
        System.out.println(animal2.equals("Lion")); // false - L from upper case

        String animal3 = new String("Lion");
        System.out.println(animal2.equals(animal3)); // false

        System.out.println(animal3.equals("Lion")); // true


    }
}
