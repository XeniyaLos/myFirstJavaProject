package operators;

public class Comparison {
    public static void main (String [] args){

        /*
        Comparison operators: <, >, <=, >=, ==
         */

        boolean b = 5 > 2; // true
        b = 5 < 2; // false

        /*
             == equals operator, compares 2 values if they are equal
         */
        b = 10 == 10; // true
        b = 10 == 5; // false

        /*
            >=, <=
         */

        b = 10 >= 5; // true
        b = 10 <= 5; // false

        // --------

        String str = "abc";
        String str2 = "123";
        System.out.println(str + str2); //abc123
        System.out.println(1 + 5); //6
        System.out.println(str +  1 + 5); //abc15
        System.out.println(1 + 2 + 3 + str); //6abc
        System.out.println(1 + 2 + 3 + str + 2 + 4); //6abc24


    }
}
