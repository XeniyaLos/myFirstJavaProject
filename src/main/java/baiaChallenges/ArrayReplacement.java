package baiaChallenges;

import java.util.Scanner;

public class ArrayReplacement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int [] x = new int[10];
        System.out.print("Enter 10 numbers: ");

        for(int i = 0; i < x.length; i++){

            x[i] = scan.nextInt();
            if(x[i] <= 0){
                x[i] = 1;
            }
            System.out.println("X[" + i + "] = " + x[i]);
        }


    }
}
