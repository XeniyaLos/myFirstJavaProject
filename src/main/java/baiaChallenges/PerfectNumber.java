package baiaChallenges;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of test cases: ");
        int testCaseNumber = scan.nextInt();

        int [] array = new int[testCaseNumber];
        int sum = 0;

        System.out.println("Enter number: ");
        for(int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        for(int i = 0; i < array.length; i++) {
            sum = 0;
            for (int j = 1; j < array[i]; j++) {
                if (array[i] % j == 0) {
                    sum = sum + j;
                }
            }

            if (array[i] == sum) {
                System.out.println(array[i] + " is a perfect number");
            } else {
                System.out.println(array[i] + " is not a perfect number");
            }
        }

        isPerfect(6);

    }

    public static void isPerfect(int number){

        int sum = 0;
        for(int i = 1; i < number; i++){
            if(number % i == 0){
                sum = sum + i;
            }
        }
        if(number == sum){
            System.out.println(number + " is perfect");
        }else {
            System.out.println(number + " is not perfect");
        }
    }
}
