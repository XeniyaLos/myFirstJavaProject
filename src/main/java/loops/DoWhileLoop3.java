package loops;

import java.util.Scanner;

public class DoWhileLoop3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean answer;

        do{
        System.out.print("Enter first number: ");
        int a = scan.nextInt();

        System.out.print("Enter arithmetic operator: ");
        String operator = scan.next();

        System.out.print("Enter second number: ");
        int b = scan.nextInt();

        if(operator.equals("+")){
            System.out.println(a + " + " + b + " = " + (a + b));
        }else if(operator.equals("-")) {
            System.out.println(a + " - " + b + " = " + (a - b));
        }else if(operator.equals("*")) {
            System.out.println(a + " * " + b + " = " + (a * b));
        }else if(operator.equals("/")) {
            System.out.println(a + " / " + b + " = " + (a / b));
        }

        System.out.println("Do you want to play again? true/false");
        answer = scan.nextBoolean();

        }while(answer);


    }
}
