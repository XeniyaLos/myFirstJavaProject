package groceryStore;

import java.util.*;

public class Buyer {
    Scanner scan = new Scanner(System.in);

    String fullName;
    String address;
    int age;
    boolean isResident;

    public void enterInfo(String name, String address1, int age1, boolean resident){
        fullName = name;
        age = age1;
        address = address1;
        isResident = resident;
    }
    public void display(){
        System.out.println("Buyer's display");
        System.out.println("Full name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("Resident: " + isResident);
        System.out.println("Address: " + address);
    }

    public void updateResidency(boolean newResidency){
        isResident = newResidency;
    }

    public String search(){
        System.out.print("\nEnter the product you would like to look for: ");
        String word = scan.nextLine();
        return word;
    }

    public void addToCart(String product){
        System.out.println("\n" + product + " has been added to your cart.\n");
    }

    public void updateProfile(String name, String address1, int age1, boolean newResidency){
        fullName = name;
        address = address1;
        age = age1;
        isResident = newResidency;
    }
}

