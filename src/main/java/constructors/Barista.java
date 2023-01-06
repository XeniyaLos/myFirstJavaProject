package constructors;

public class Barista {

    String name;
    String position;
    double salary;
    char gender;
    boolean isExperienced;
    boolean areHandsClean;
    boolean isHappy;
    static double jarOfTips = 2.50;


    public Barista(String name, String position, double salary){
        this.name = name;
        this.position = position;
        this.salary = salary;
        System.out.println("Hired a new " + position + ". The name is " + name + ", with salary: " + salary + "$ per hour.");
    }

    public Barista(String name, boolean isExperienced){
        this.name = name;
        this.isExperienced = isExperienced;
        System.out.println("Hired new barista " + name + ". Experienced: "+ isExperienced);
    }

    public void talkToClient(String clientsName){
        System.out.println(name + " is talking to client: " + clientsName);
    }

    public void steamMilk(String typeOfMilk){
        System.out.println(name + " is steaming " + typeOfMilk + " milk");
    }

    public void takeOrder(String orderName, String clientsName){
        System.out.println(position + " " + name + " is taking order of " + orderName
        + " from client: " + clientsName);
    }

    public void washHands(boolean cleanHands){
        if(cleanHands) {
            System.out.println(name + " 's hands are clean. Not washing again.");
            areHandsClean = true;
        }else{
            System.out.println(name + " is washing the hands.");
            areHandsClean = true;
        }
    }

    public boolean getTips(double tips){
        if(tips > 0){
            System.out.println(position + " " + name + " is getting tips in amount of: "
                    + tips + "$");
            isHappy = true;
            jarOfTips += tips;
            return true;
        }
        System.out.println("No tips for " + position + " " + name + " this time");
        isHappy = false;
        return false;
    }

    public boolean isBaristaHappy(){
        return isHappy;
    }
}
