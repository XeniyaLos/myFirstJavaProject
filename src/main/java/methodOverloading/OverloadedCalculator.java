package methodOverloading;

public class OverloadedCalculator {
    public static void main(String[] args) {

        System.out.println(addition(5, 10));
        System.out.println(addition(4, 3, 2));
        System.out.println(addition(2.3, 4));

        System.out.println(division(20, 5f));
    }


    public static double addition(int a, int b){
        return (double)(a + b);
    }

    public static double addition(int a, int b, int c){
        return (double) (a + b + c);
    }

    public static double addition(double a, double b){
        return a + b;
    }
    // ------------------------------------------------
    public static double subtraction(int a, int b){
        return (double)(a - b);
    }

    public static double subtraction(int a, int b, int c){
        return (double)(a - b - c);
    }

    public static double subtraction(double a, double b){
        return a - b;
    }
    // --------------------------------------------------------
    public static double multiplication(int a, int b){
        return (double)(a * b);
    }
    public static double multiplication(int a, int b, int c){
        return (double)(a * b * c);
    }
    public static double multiplication(double a, double b){
        return a * b;
    }
    // ------------------------------------------------------------
    public static double division(int a, int b){
        return (double)(a / b);
    }
    public static double division(int a, int b, int c){
        return (double)(a / b / c);
    }
    public static double division(double a, double b){
        return a / b;
    }
}
