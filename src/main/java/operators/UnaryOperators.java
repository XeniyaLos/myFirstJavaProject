package operators;

public class UnaryOperators {
    public static void main (String [] args){

        // --- Unary operators
        // ++, +=
        // --, -=
        // *=, /=

        int a = 5;
        int b = 10;

        a = ++a; // 6 (a = a + 1)
        b = ++b; // 11
        b = --a; // 5
        System.out.println(b);

        a += 2; // 5 + 2 (a = a + 2)
        System.out.println(a);

        b += 10; // 5 + 10
        System.out.println(b);

        //---

        int x = 50;
        int y = 2;

        x /= y; // 25 (x = x / y)
        y *= x; // 25 * 2 (y = y * x)

        // ------- prefix and postfix -----//

        // ++x
        // x++

        x = 5;
        y = ++x;
        System.out.println("The value of x: " + x);
        System.out.println("The value of y: " + y);

        x = 5;
        y = x++;
        System.out.println("New value of y: " + y);
        System.out.println("New value of x: " + x);

        x = 10;
        y = x++;
        System.out.println("Last value of y: " + y);
        System.out.println("Last value of x: " + x);

        x = 1;
        x = ++x;
        System.out.println("New value of x: " + x);


    }
}
