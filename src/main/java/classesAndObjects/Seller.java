package classesAndObjects;

public class Seller {

    String storeName;
    String phoneNumber;
    int numberOfEmployees;
    boolean isHalal;

    public void display() {
        System.out.println("Buyer's display");
        System.out.println("Store name: " + storeName);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("Halal: " + isHalal);
        System.out.println("Number of employees: " + numberOfEmployees);
    }

}
