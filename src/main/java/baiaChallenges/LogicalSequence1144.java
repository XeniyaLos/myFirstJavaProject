package baiaChallenges;

import java.util.Scanner;

public class LogicalSequence1144 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
// NOT FINISHED
        System.out.print("Enter number: ");
        int number = scan.nextInt();

        for(int i = 1; i <= number; i++){
            for(int j = 0; j < 2; j++) {
                int sq = i * i;
                int multi = i * sq;
                System.out.println(i + " " + sq + " " + multi);
            }
        }
    }
}
