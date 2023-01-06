package truckingSoftware;

public class Driver {

    String fullName;
    int age;
    boolean isNew;

    public void printInfo(){
        System.out.println("Driver's name: " + fullName);
        System.out.println("Driver's age: " + age);
        System.out.println("Is driver new: " + isNew);
    }

    public void reportAccident(String location){
        System.out.println("\n" + fullName + " got in accident in " + location);
    }

    // This method should print out %name is driving
    public void drive(){
        System.out.println(fullName + " is driving.");
    }

    // Create method called sendLocation and return drivers location
    public String sendLocation(){
        return "LA";
    }

    // Create a method sendTotalLoads and return today's number of loads
    public int sendTotalLoads(){
        int totalLoads = 5;
        return totalLoads;
    }
}
