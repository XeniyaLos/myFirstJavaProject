package methodOverloading;

public class MethodOverloading2 {
    public static void main(String[] args) {

    }

    public static int sum(int a, int b){
        return a + b;
    }

    public static int sum(double a, double b){
        return (int)(a + b);
    }

    public static int sum(float a, float b){
        return (int)(a + b);
    }

    public static int sum(int a, int b, int c){
        return a + b + c;
    }

    public static int sum(long a, long b, long c){
        return (int)(a + b + c);
    }

    public static String stringMethod(String [] strArr, int a, int b, boolean isOld){
        return "";
    }

    public static String stringMethod(int a, double b, String str, String str1, int [] arr){
        return "";
    }

    public static String stringMethod(String a, String b, String c, String d, String e, String f, String g, String h, String j, String k){
        return a;
    }
}
