package baiaChallenges;

import java.util.*;

public class ReadTheIntegerN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the integer N: ");
        int n = scan.nextInt();
        int in = 0;
        int out = 0;

        for (int i = 0; i < n; i++) {
            int nRow = scan.nextInt();
                if(nRow >= 10 && nRow <= 20){
                in += 1;
                 }else{
                out += 1;
            }
        }
        System.out.println(in + " in");
        System.out.println(out + " out");
    }
}
