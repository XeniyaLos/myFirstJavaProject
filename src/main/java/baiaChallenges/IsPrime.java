package baiaChallenges;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = scan.nextInt();

        for(int i = 0; i < n; i++){
            boolean isPrime = true;
            int number = scan.nextInt();

            for(int j = 2; j < number; j++){

                if(number % j == 0){
                    System.out.println(number + " is not prime");
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                System.out.println(number + " is Prime");
            }
        }
    }
    // =============== Method ==================

    public static boolean isPrime(int number){
        boolean isPrime = false;
        int count = 0;
        for(int i = 1; i <= number; i++){
            if(number % i == 0){
                count++;
            }
        }
        if(count == 2){
            isPrime = true;
        }else if(count > 2){
            isPrime = false;
        }
        return isPrime;
    }
}
