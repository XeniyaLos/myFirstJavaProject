package loops;

public class ForLoop {
    public static void main(String[] args) {
        /*
        create program that will print numbers from 2 - 50
         */
        for(int i = 2; i <= 50; i++){
            //System.out.println(i);
        }

        /*
        print numbers from 0 - 1000
         */
        for(int i = 0; i <= 1000; i++){
            //System.out.println(i);
        }

        for(int i = 1; i <= 50; i++){
            //System.out.println("apple #" + i);
        }

        for(int i = 1; i <= 10; i++){
            int result = 2 * i;
            //System.out.println("2 * " + i + " = " + result);
        }

        for(int i = 1; i <= 10; i++){
            int result = 9 * i;
            //System.out.println("9 * " + i + " = " + result);
        }

        for(int i = 1; i <= 100; i++) {
            int result = 100 * i;
            //System.out.println("100 * " + i + " = " + result);
        }

        for(int i = 0; i < 5; i++){
            //System.out.println("Java is fun");
        }

        for(int i = 0; i < 50; i++){
            //System.out.println("My name is Xeniya");
        }

        for(int i = 10; i >= 1; i--){
            //System.out.println("The value of x is: " + i);
        }

        for(int i = 100; i > 0; i--){
            if(i % 2 == 0){
                //System.out.println(i + " - even");
            }else{
                //System.out.println(i + " - odd");
            }
        }

        for(int i = 10; i >= 0; i-=2){
            //System.out.println("The value of y is: " + i);
        }

        for(int i = 1; i <= 15; i+=2){
            //System.out.println("The value of num is: " + i);
        }



        //multiplication(5);
        //addition(5);
        //division(16);
        //method1(10);
        method2(5);

    }

    public static void multiplication(int number){
        for(int i = 1; i <= 10; i++){
            int result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }
    }

    public static void addition(int number) {
        for (int i = 1; i <= 50; i++) {
            int result = number + i;
            System.out.println(number + " + " + i + " = " + result);
        }
    }

    public static void division(int number){
        for(double i = 1; i <= 5; i++){
            double result = number / i;
            System.out.println(number + " / " + i + " = " + result);
        }
    }

    public static void method1(int number){
        int sum = 0;
        for(int i = 1; i <= number; i++){
            System.out.println("The value of x is: " + i);
            sum = sum + i;
        }
        System.out.println("The sum of all numbers = " + sum);
    }

    public static void method2(int number){
        int total = 1;
        for(int i = 1; i <= number; i++){
            System.out.println("The value of x is: " + i);
            total = total * i;
        }
        System.out.println("The total of all numbers = " + total);
    }


}
