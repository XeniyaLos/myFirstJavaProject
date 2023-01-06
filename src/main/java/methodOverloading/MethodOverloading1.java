package methodOverloading;

public class MethodOverloading1 {
    public static void main(String[] args) {

        method1();
        method1(5);
        method1("Hello");
        method1(4.99);
        method1('d');
        method1("Chicago", 60089);
    }

    public static void method1(){
        System.out.println("Inside method with no parameters");
    }

    public static void method1(int a){
        System.out.println("Inside method with int b");
    }

    public static void method1(String name){
        System.out.println("Inside method with String name");
    }

    public static void method1(double height){
        System.out.println("Inside method with double height");
    }

    public static void method1(String city, int zipcode){
        System.out.println("Inside method with String city and int zipcode");
    }

    public static void method1(char character){
        System.out.println("Inside method with char character");
    }

    // ================================
}
