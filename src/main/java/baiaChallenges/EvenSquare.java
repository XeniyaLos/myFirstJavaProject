package baiaChallenges;

import java.util.Scanner;

public class EvenSquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        if (n > 5 && n < 2000){
            for(int i = 1; i <= n; i++) {
                int square = 0;
                if (i % 2 == 0) {
                    square = i * i;
                    System.out.println(i + "^2 = " + square);
                }
            }
        }
    }
}
