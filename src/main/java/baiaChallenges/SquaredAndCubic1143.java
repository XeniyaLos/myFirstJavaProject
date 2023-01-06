package baiaChallenges;

import java.util.Scanner;

public class SquaredAndCubic1143 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = scan.nextInt();

        for(int i = 1; i <= number; i++){
            int sq = i * i;
            int malti = i * sq;
            System.out.println(i + " " + sq + " " + malti);
        }
    }
}
