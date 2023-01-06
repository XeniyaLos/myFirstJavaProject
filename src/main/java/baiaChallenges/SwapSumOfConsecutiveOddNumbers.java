package baiaChallenges;

import java.util.*;

public class SwapSumOfConsecutiveOddNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int x = scan.nextInt();

        System.out.print("Enter second integer: ");
        int y = scan.nextInt();

        int sum = 0;

        if(x > y){
            int temp = x;
            x = y;
            y = temp;
            for (int i = x + 1; i < y; i++) {
                if (i % 2 != 0) {
                    sum = sum + i;
                }
            }
        }else{
                    sum = 0;
                }

        System.out.println("Sum is " + sum);
    }
}
