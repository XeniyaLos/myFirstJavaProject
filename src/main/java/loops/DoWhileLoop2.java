package loops;

import java.util.Scanner;

public class DoWhileLoop2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean answer;
        do {
            System.out.print("Enter first number: ");
            int a = scan.nextInt();

            System.out.print("Enter second number: ");
            int b = scan.nextInt();

            int sum = a + b;
            System.out.println(a + " + " + b + " = " + sum);
            System.out.println("Do you want to try again? true/false ");
            answer = scan.nextBoolean();
        }while(answer);




    }
}
