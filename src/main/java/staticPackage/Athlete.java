package staticPackage;

public class Athlete {

    String name;
    int age;
    String lastName;

    static String gymPhone;
    static int gymZipcode;
    static String gymName;

    public void exercise(){
        System.out.println(name + " is exercising.");
    }

    public void register(){
        System.out.println("New Athlete: " + name + " " + lastName + ". Age: " + age + " were registered at " + gymName);
    }

    public static void goingToGym(){
        System.out.println("People in Chicago likes going to " + gymName + " to exercise");
    }

    public static void gymInfo(){
        System.out.println("");
    }
}
