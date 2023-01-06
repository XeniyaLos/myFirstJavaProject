package loops;

public class DoWhileLoop {
    public static void main(String[] args) {

        String text = "Hello";
        boolean b = false;

        while(b){
            //System.out.println(text); // will not print anything
            b = false;
        }

        do{
            //System.out.println(text); // print hello once
        }while(b);

        // ----- //

        int a = 5;

        do{
            //System.out.println(a + "Hello");
            a--;
        }while(a > 0);

        int c = 5;
        while(c > 0){
            //System.out.println(c + " Hello");
            c--;
        }

        // ------- //

        int sum = 0;
        int i = 100;

        do {
            if(i % 5 == 0 && i % 2 != 0){
                System.out.println(i + " weird number");
            }
            if (i % 5 == 0) {
                System.out.println(i + " divisible by 5");
            }
            if(i % 2 == 0 && i % 5 != 0){
                System.out.println(i + " even number");
            }
            if(i % 5 != 0 && i % 2 != 0){
                System.out.println(i + " odd number");
            }
            sum += i;
            i--;

        }while(i >= 1);
        System.out.println("sum = " + sum);


    }
}
