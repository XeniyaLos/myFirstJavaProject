package ifElseLogicalOperators;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        System.out.print("Please enter first number: ");
        double firstNumber = user.nextDouble();

        System.out.print("Please enter the arithmetic operator: ");
        String operator = user.next();

        System.out.print("Please enter second number: ");
        double secondNumber = user.nextDouble();

        double result;

        if(operator.equals("+")){
            result = firstNumber + secondNumber;
            System.out.println(firstNumber + " " + operator + " " + secondNumber + " = " + result);
        }else if(operator.equals("-")){
            result = firstNumber - secondNumber;
            System.out.println(firstNumber + " " + operator + " " + secondNumber + " = " + result);
        }else if(operator.equals("/")){
            result = firstNumber / secondNumber;
            System.out.println(firstNumber + " " + operator + " " + secondNumber + " = " + result);
        }else if(operator.equals("*")){
            result = firstNumber * secondNumber;
            System.out.println(firstNumber + " " + operator + " " + secondNumber + " = " + result);
        }else if(operator.equals("%")){
            result = firstNumber % secondNumber;
        }else{
            System.out.println("ERROR! Please enter valid operator");
            result = -1;
        }
        System.out.println("The result is: " + result);
    }
}
