package homework;

public class CalculatorUser {
    public static void main(String[] args) {

        Calculator user = new Calculator();
        int addTotal = user.add();
        System.out.println("Sum = " + addTotal);

        int subTotal = user.subtract();
        System.out.println("The difference = " + subTotal);

        int division = user.divide();
        System.out.println("The quotient = " + division);

        int product = user.multiply();
        System.out.println("The product = " + product);
    }
}
