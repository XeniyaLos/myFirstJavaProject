package scannerClass;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ScannerString {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*System.out.println("Please enter your first name: ");
        String firstName = scan.nextLine();

        System.out.println("Please enter your last name: ");
        String lastName = scan.nextLine();

        System.out.println("Please enter your age: ");
        byte age = scan.nextByte();

        System.out.println("\nHello " + firstName + " " + lastName + "!"
                + "\nYou are so young! Just " + age + " years old!");



        System.out.print("Please enter first number: ");
        int a = scan.nextInt();

        System.out.print("Please enter second number: ");
        int b = scan.nextInt();

        int result = a * b;
        System.out.println(a + " * " + b + " = " + result);

        // ------ //

        System.out.print("Please enter first number: ");
        int a1 = scan.nextInt();

        System.out.print("Please enter second number: ");
        int b1 = scan.nextInt();

        System.out.print("Please enter third number: ");
        int c1 = scan.nextInt();

        int result1 = a1 + b1 + c1;
        System.out.print(a1 + " + " + b1 + " + " + c1 + " = " + result1); */

        // -------------- //

        System.out.print("Enter the product you would like to purchase: ");
        String product = scan.nextLine();

        System.out.print("Enter the quantity of the product: ");
        int quantity = scan.nextInt();

        System.out.print("Price of the single item: ");
        double price = scan.nextDouble();

        double total = price * quantity;
        System.out.println("You purchased " + quantity + " " + product + " each cost $" + price
        + ", the total will be $" + total);

    }
}
