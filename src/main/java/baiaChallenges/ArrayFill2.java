package baiaChallenges;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayFill2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number from 3 to 50: ");
        int t = scan.nextInt();

        int [] n = new int[1000];

        int i = 0;
        int j = 0;
        while(i < n.length){
            n[j] = j;
            System.out.println("N[" + i + "] = " + j);
            //System.out.println(n[i] + j);
            j++;

            if(j > t - 1){

                j = 0;
            }
            i++;
        }

        // ================ for loop solution ==========
/*
        int n[] = new int[1000];

        t = scan.nextInt();


        for (int i = 0, j = 0; i < 1000; j++,i++) {
            n[j] = j;
            if ((n[j]) == t) {
                j = 0;
            }
            System.out.print("N[" + i + "] = " + n[j] + "\n");
        }
    }

 */


    }
}
