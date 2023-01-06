package truckingSoftware;

public class TruckSoft {
    public static void main(String[] args) {

        Driver driver1 = new Driver();

        driver1.fullName = "Messi";
        driver1.age = 47;
        driver1.isNew = true;

        driver1.printInfo();
        driver1.reportAccident("LA");
        driver1.drive();
        String location = driver1.sendLocation();
        System.out.println(location);

        int loads = driver1.sendTotalLoads();
        System.out.println(loads);
    }
}
