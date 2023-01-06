package baiaChallenges;

import java.util.*;

public class BaiaChallenge {
    public static void main (String [] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Seller's name is: ");
        String name = scan.nextLine();
        System.out.print("Seller's fixed salary is: ");
        double fixedSalary = scan.nextDouble();
        System.out.print("Seller's total sales is: ");
        double totalSales = scan.nextDouble();
        double salesPercentage = totalSales * 0.15;
        double totalSalary = fixedSalary + salesPercentage;
        System.out.printf("TOTAL = R$ " + "%.2f", totalSalary);
        System.out.println();

        System.out.print("Person's age in days is: ");
        int age = scan.nextInt();
        int years = age / 365;
        int months = (age % 365) / 30;
        int days = (age - 365 * years) % 30;

        System.out.println(years + " year(s)");
        System.out.println(months + " month(s)");
        System.out.println(days + " day(s)");




    }
}
