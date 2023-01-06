package operators;

public class RecapOperators {
    public static void main (String [] args){

        System.out.println("Hello Codewise!");

        String text = "Java Programmer";
        int num = 20;
        double d = 10.23;
        char c = 'j';
        char k = '&';
        byte b = 12;

        System.out.println("String text: " + text);
        System.out.println("int: " + num);
        System.out.println("double d: " + d);
        System.out.println("char c: " + c);
        System.out.println("char k: " + k);
        System.out.println("byte b: " + b);

        int n = 20;
        double d2 = 30.5;

        //n = d2 - will not work coz int can store only whole numbers
        //d2 = n - it will work coz double will convert int do decimal number 20.0

        int length = 145;
        int width = 145;
        int area = length * width;
        System.out.println("The length of the square is: " + length);
        System.out.println("The width of the square is: " + width);
        System.out.println("The area of the square is: " + area);

        int a = 123;
        int e = 123;
        int perimeter = 2 * (a + e);
        System.out.println("The length of the square is: " + a);
        System.out.println("The width of the square is: " + e);
        System.out.println("The perimeter of the square is: " + perimeter);

        int x = 54;
        int y = 98;
        int perimeter1 = 2 * (x + y);
        System.out.println("The length of the rectangle is: " + x);
        System.out.println("The width of the rectangle is: " + y);
        System.out.println("The perimeter of the rectangle is: " + perimeter1);

        x = 1234;
        y = 4134;
        area = x * y;
        System.out.println("The length of the rectangle is: " + x);
        System.out.println("The width of the rectangle is: " + y);
        System.out.println("The area of the rectangle is: " + area);

        int s = 12, f = 5;

        //addition operator
        System.out.println("s + f = " + (s + f));

        //subtraction operator
        System.out.println("s - f = " + (s - f));

        //multiplication operator
        System.out.println("s * f = " + (s * f));

        //division operator
        System.out.println("s / f = " + (s / f));

        // ----------- //

        int result = 1 + 2; // result is now 3
        System.out.println(result);

        //result = result - 1; // result is now 2
        result -= 1;
        System.out.println(result);

        //result = result * 2; // result is now 4
        result *= 2;
        System.out.println(result);

        //result = result / 2; // result is now 2
        result /= 2;
        System.out.println(result);

        //result = result + 8; // result is now 10
        result += 8;
        System.out.println(result);

        //result = result % 7; // result is now 3
        result %= 7;
        System.out.println(result);

        int i = 3;
        i++; // 3 + 1
        System.out.println("i 1: " + i); // 4

        ++i; // 4 + 1
        System.out.println("i 2: " + i); // 5
        System.out.println("i 3: " + ++i); // 6
        System.out.println("i 4: " + i++); // 6 coz on this line no new assignment of i, it will happen only on next line
        System.out.println("i 5: " + i++ + "----" + i); // 8

        // ---- Comparison operators ---- //

        boolean compare;
        compare = 3 == 5;
        System.out.println("3 == 5: " + compare); // false
        System.out.println("3 > 5: " + (3 > 5)); // false
        System.out.println("3 < 5 " + (3 < 5)); // true
        System.out.println("3 >= 5 " + (3 >= 5)); // false
        System.out.println("3 <= 5 " + (3 <= 5)); // true
        System.out.println("5 <= 5 " + (5 <= 5)); // true
        System.out.println("3 != 5 " + (3 != 5)); // true

        int age = 30;
        int years = -30;
        boolean isTrue = age != years;
        System.out.println(isTrue); // true

        age = 5;
        years = 5;
        isTrue = age != years;
        System.out.println(isTrue); // true

        int x1 = 10, y1 = 5;
        /* int exp1 = (y1 * (x1 / y1 + x1 / y1));
        int exp2 = (y1 * x1 / y1 + y1 * x1 / y1);
        */

        int exp2 = y1 * x1 / y1;
        int exp3 = y1 * x1 / y1;
        exp2 = exp2 + exp3;
        System.out.println(exp2);

        int xd = 9, yd = 12;
        int ad = 2, bd = 4, cd = 6;

        int exp = (3 + 4 * xd) / 5 - 10 * (yd -5) * (ad + bd + cd) / xd + 9 * (4 / xd + (9 + xd) / yd);
        System.out.println(exp);

        char number = 'a';
        char number1 = 'b';
        System.out.println(number);
        System.out.println(number1);
        System.out.println(number + " " + number1);




    }
}
