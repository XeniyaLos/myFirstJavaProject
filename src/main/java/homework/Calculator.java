package homework;

import java.util.*;

public class Calculator {
    Scanner scan = new Scanner(System.in);

    public int add(){
        System.out.println("Calculate sum of 2 numbers");
        System.out.print("Enter first number: ");
        int firstNumber = scan.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = scan.nextInt();

        int total = firstNumber + secondNumber;
        return total;
    }

    public int subtract(){
        System.out.println("\nCalculate the difference of 2 numbers");
        System.out.print("Enter first number: ");
        int firstNumber = scan.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scan.nextInt();
        int total = firstNumber - secondNumber;
        return total;
    }

    public int divide(){
        System.out.println("\nCalculate the quotient (division) of 2 numbers");
        System.out.print("Enter first number: ");
        int firstNumber = scan.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scan.nextInt();
        int total = firstNumber / secondNumber;
        return total;
    }

    public int multiply(){
        System.out.println("\nCalculate the product (multiplication) of 2 numbers");
        System.out.print("Enter first number: ");
        int firstNumber = scan.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scan.nextInt();
        int total = firstNumber * secondNumber;
        return total;
    }
}
