package staticPackage;

public class TruckCompany {
    public static void main(String[] args) {

        Driver driver1 = new Driver("Donald");
        Driver driver2 = new Driver("David");

        driver1.drive("Columbus, Ohio");
        driver1.drive("Pennsylvania");

        System.out.println(driver2.isPaid); // false
        Driver.getPaid();

        System.out.println(driver1.isPaid); // true
    }
}
