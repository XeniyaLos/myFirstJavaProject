package mentoring;

public class EsenMethodPractice {
    public static void main(String[] args) {
        String city = "Chicago";
        welcome(city);

        int a1;
        int b1;
        a1 = 10;
        b1 = 5;
        add(a1, b1);

        double productPrice;
        productPrice = 100;
        double afterTax = calculateSalesTax(productPrice);
        System.out.println("Price after tax: $" + afterTax);

        double amountToPayAfterDiscount = discount20(afterTax);
        System.out.println("Total amount to pay after discount: $" + amountToPayAfterDiscount);


    }

    public static void welcome(String someCity){
        System.out.println("Welcome to " + someCity);
    }

    public static void add(int a, int b){
        int result = a + b;
        System.out.println(a + " + " + b + " = " + result);
    }

    public static double calculateSalesTax(double price){
        double salesTax = price * 0.06;
        double result = price + salesTax;
        return result;
    }

    public static double discount20(double price){
        double discount = price * 0.2;
        double totalAmountAfterDiscount = price - discount;
        return totalAmountAfterDiscount;
    }


}
