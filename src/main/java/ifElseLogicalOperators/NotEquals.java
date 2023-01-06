package ifElseLogicalOperators;

import java.util.concurrent.Callable;

public class NotEquals {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 5;

        System.out.println(num1 != num2); // true
        System.out.println(num1 == num2); //false

        String name1 = "Johny";
        String name2 = "Johny";
        String name3 = new String("Johny");

        System.out.println(name1 == name2); //true
        System.out.println(name1 == name3); //false
        System.out.println(name1 != name3); //true
        System.out.println(name1 != name2); //false

        /*
        .equals() to compare values, can only be uesed by String
         */

        System.out.println(name1.equals(name2)); //true
        System.out.println(name1.equals(name3)); //true
        System.out.println(!name1.equals(name2)); //false

        Calculator calculator1 = new Calculator();
        Calculator calculator2 = new Calculator();
        Calculator calculator3 = calculator1;


        System.out.println("1 "+calculator1.equals(calculator2)); //false
        System.out.println(calculator1.equals(calculator3)); //true
        System.out.println(calculator1 == calculator3); //true
        System.out.println(calculator1 == calculator2); //false

    }
}
