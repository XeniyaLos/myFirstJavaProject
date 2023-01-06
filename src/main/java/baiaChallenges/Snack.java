package baiaChallenges;

import java.util.*;

public class Snack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Product code: ");
        int x = scan.nextInt();
        System.out.print("Product quantity: ");
        int y = scan.nextInt();
        double price = 0;

        if(x == 1){
            price = 4.00 * y;
        }else if(x == 2){
            price = 4.50 * y;
        }else if(x == 3){
            price = 5.00 * y;
        }else if(x == 4){
            price = 2.00 * y;
        }else if(x == 5){
            price = 1.50 * y;
        }
        System.out.printf("Total: R$ " + "%.2f", price);
    }

}
