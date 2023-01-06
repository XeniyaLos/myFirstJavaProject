package recap;

public class ForLoop {
    public static void main(String[] args) {

        // ====== CHRISTMAS TREE ==========
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // ====== FLOYDS TRIANGLE =======

        int value = 1;
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(value + " ");
                value++;
            }
            System.out.println();
        }
        // ===============================

        for(int i = 1; i < 11; i++){
            System.out.println(2 + " * " + i + " = " + (2 * i));
        }

        for(int i = 10; i >= 0; i -= 2){
            System.out.println("The value of x is: " + i);
        }

        int sum = 0;
        for(int i = 1; i <= 10; i++){
            System.out.println("The value of i is: " + i);
            sum += i;
        }
        System.out.println("The sum: " + sum);
    }
}
