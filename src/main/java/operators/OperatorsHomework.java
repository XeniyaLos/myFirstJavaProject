package operators;

public class OperatorsHomework {
    public static void main (String [] args){

        // ---- 1 ---- //

        int a = 100;
        int b = 200;
        int sum = a + b;
        System.out.println("First sum = " + sum);

        // ---- 2 ----- //

        int q = 5;
        int w = 9;
        int e = 10;
        int sum1 = q + w + e;
        System.out.println("Second sum = " + sum1);

        // ---- 3 ---- //
        int num = 1;
        int num1 = 2;
        int sum2 = num + num1;
        System.out.println(num + " + " + num1 + " = " + sum2);

        int num2 = 3;
        sum2 = num2 - num;
        System.out.println(num2 + " - " + num + " = " + sum2);

        sum2 = num1 * num1;
        System.out.println(num1 + " * " + num1 + " = " + sum2);

        int num3 = 4;
        sum2 = num3 / num1;
        System.out.println(num3 + " / " + num1 + " = " + sum2);

        int num4 = 8;
        sum2 = num1 + num4;
        System.out.println(num1 + " + " + num4 + " = " + sum2);

        int num5 = 10;
        int num6 = 7;
        int mod = num5 % num6;
        System.out.println(num5 + " % " + num6 + " = " + mod);

        // ---- 4 ---- //
         int length = 15;
         int width = 9;
         int p = 2 * (length + width);
         int area = length * width;
         System.out.println("Perimeter of a rectangle = " + p);
         System.out.println("Area of a rectangle = " + area);

         // --- 5 --- //
        int f = 2325;
        int result = (f + 8) / 3 % 5 * 5;
        System.out.println("The result: " + result);

        // --- 6 --- //
        f += 8;
        f /= 3;
        f %= 5;
        f *= 5;
        System.out.println("The result using assignment operators: " + f);


        // ---7 and 8 --- //
        int i = 23;
        int j = 45;
        boolean k = i == j;
        System.out.println(k);

        i = -10;
        j = 10;
        boolean l = i == j;
        System.out.println(l);

    }
}
