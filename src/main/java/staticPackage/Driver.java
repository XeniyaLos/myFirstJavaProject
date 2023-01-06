package staticPackage;

public class Driver {

    String name;
    static boolean isPaid;

    public Driver(String name){
        this.name = name;
        System.out.println("Hired a new driver: " + name);
    }

    {
        System.out.println("HR is interviewing a new driver!");
    }

    static {
        System.out.println("Good morning! Trucking company is open now!");
    }

    public void drive(String destination){
        System.out.println(name + " is on route to " + destination);
    }

    public static boolean getPaid(){
        System.out.println("Drivers got paid");
        isPaid = true;
        return true;
    }
}
