package homework;

import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(convertDayToSec(3));

        // I WAS ABLE TO FIGURED IT OUT ON MY OWN!!! :) PLAYING AROUND WITH VARIABLES
        int value = 1;
        for (int i = 1; i <= 5; i++) {
            for(int j = 1; j <= i; j++){
                System.out.print(value + " ");
                value++;
            }
            System.out.println();
        }

        // Write a program that checks if given integer
        // is prime number and submit the file

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


        // Write a program to reverse a String
        System.out.print("Write a word to reverse: ");
        String str = scan.next();
        for(int i = str.length(); i > 0; i--){
            System.out.print(str.charAt(i -1));
        }
    }

    // Write a program to convert given number of days into seconds

    public static long convertDayToSec(int numOfDays){
        long numOfSecondsInDay = 24 * 60 * 60;
        return numOfDays * numOfSecondsInDay;
    }

    // ====== isPRIME =========================

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
        }
        return isPrime;
    }
}
