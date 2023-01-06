package baiaChallenges;

import java.util.Scanner;

public class SwapRestOfDivision {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x = scan.nextInt();
        System.out.print("Enter second number: ");
        int y = scan.nextInt();

        /*if(x > y) {
            for (int i = y; i < x; i++){
                if(i % 5 == 2 || i % 5 == 3){
                    System.out.println(i);
                }
            }
        }else if(x < y){
            for(int i = x; i < y; i++){
                if(i % 5 == 2 || i % 5 == 3){
                    System.out.println(i);
                }
            }
        } */

        if(x > y) {
            int temp = x;
            x = y;
            y = temp;
        }
            for (int i = x; i < y; i++){
                if(i % 5 == 2 || i % 5 == 3){
                    System.out.println(i);
                }
            }
        }
    }

