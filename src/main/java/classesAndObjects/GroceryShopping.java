package classesAndObjects;

import groceryStore.Buyer;

public class GroceryShopping {
    public static void main (String [] args){

        Buyer b1 = new Buyer();

        Seller marianos = new Seller();

        marianos.storeName = "Mariano's";
        marianos.isHalal = true;
        marianos.numberOfEmployees = 34;
        marianos.phoneNumber = "65765788";

        System.out.println(marianos.phoneNumber);
        System.out.println(marianos.isHalal);
        System.out.println(marianos.numberOfEmployees);
        System.out.println(marianos.phoneNumber);

        Seller costco = new Seller();
        costco.storeName = "Costco";
        costco.isHalal = false;
        costco.numberOfEmployees = 100;
        costco.phoneNumber = "7687678578";

        System.out.println("\n");
        System.out.println(costco.storeName);
        System.out.println(costco.isHalal);
        System.out.println(costco.numberOfEmployees);
        System.out.println(costco.phoneNumber);

        // ------- //

        Water water = new Water();

        water.brandName = "Good & gather";
        water.isPurified = true;
        water.price = 1;
        water.size = 16;

    }
}
