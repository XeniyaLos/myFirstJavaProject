package operators;

public class Precedence {
    public static void main (String [] args){

        int x = 2 + 3 * 2; //8
        int w = 2 * 3 + 2; //8
        x = 5 + 10 / 2 + 20 - 5; //25
        w = 3 * 2 * 10 - 7 + 10 / 3; //56 - it will be whole number coz int shows only whole numbers
        System.out.println(w);

        // -------- //

        int a = 5;
        int b = 3;
        int c = 8;

        int g = a = b; // 3 (b=3 a=b g=a)

        c = b = a; //3

        // ----------
        int z = 40;
        int n = 10;
        int m = 2;

        int f = z -n + m % 3 + 5 * 2 - (n = m);
        f = 40 - 10 + 2 + 10 - 2; //40
    }
}
