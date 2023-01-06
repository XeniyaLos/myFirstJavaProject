package baiaChallenges;

import java.util.Scanner;

public class AscendingAndDescending {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*int a;
        int b;
        do {
            a = scan.nextInt();
            b = scan.nextInt();

            if (a > b) {
                System.out.println("Descending");
            } else if (a < b) {
                System.out.println("Ascending");
            }
        } while (a != b);*/

        double a = scan.nextDouble();
        double b = scan.nextDouble();

        while(a != b) {

            if(a > b) {
                System.out.println("Decresente");
            }else{
                System.out.println("Crescente");
            }

            a = scan.nextDouble();
            b = scan.nextDouble();

        }

    }
}
