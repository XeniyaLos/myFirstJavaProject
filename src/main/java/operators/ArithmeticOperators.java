package operators;

public class ArithmeticOperators {
    public static void main (String [] args){

        //---- Assignments operator = -----//

        int x = 5;
        System.out.println("The value of x: " + x);

        // x - is operand
        // 10 - is operand
        // = - is assignment operator

        x = 10;

        int y = 20; // y is a container, 20 is a value
        int p = 10;

        y = 5;
        y = p; // y = 10
        y = y; //y = 10;
        p = y; // p = 10
        p = 5; // p = 5
        p = p + 20; // p = 25
        y = p; // y = 25 (because p already = 25)

        // -------
        String a = "abc";
        String b = "xyz";

        a = "Chicago";
        a = b;
        System.out.println(a); // xyz


        // ------ Arithmetic operators ---- //

        short num = 10;
        short num2 = 20;

        int sum = num + num2;
        System.out.println(sum);

        // --- Subtraction "-" ----//

        int q = 1;
        int r = 2;

        int s = r -q;
        System.out.println(s);

        // --- Multiplication --- //

        long l = 10;
        long k = 5;

        System.out.println(l * k);
         l = k * k;
        System.out.println(l); // l = 25
        System.out.println(l * k - 10); // 25 * 5 - 10 = 115

        // --- Division "/" --- //

        byte myByte = 9;
        byte myByte2 = 3;

        System.out.println(myByte / myByte2);
        myByte2 = (byte)(myByte / myByte2); // 3

        // --- Modulus "%" ----//

        int j = 10;
        int m = 3;

        System.out.println(j % m); // it will show the remaining value = 1
        System.out.println(j / m); // 10 / 3 = 3

        double d = 10;
        double c = 3;
        System.out.println(d / c);
        System.out.println(d % c); // 1

        // --------- PRACTICE ------- //

        int digit = 100;
        int anotherDigit = 20;
        System.out.println(digit % anotherDigit); // 0
        System.out.println(digit % 30); // 10
        System.out.println(digit % 35); // 30

    }
}
