package constructors;

public class Iphone {

    public Iphone(){
        System.out.println("inside constructor");
        this.color = "space gray";
        this.memory = 128;
        this.price = 999.99;
        this.isUnlocked = false;
    }

    public Iphone(int memoryP){
        System.out.println("this iphone has: " + memory + "Gb memory.");
        this.memory = memoryP;
    }

    public Iphone(String color){
        System.out.println("This iphone is: " + color);
        this.color = color;
    }

    String color;
    int memory;
    double price;
    boolean isUnlocked;


    public static void main(String[] args) {

        Iphone object1 = new Iphone(); // print -> inside constructor
        //System.out.println(object1); // print constructor ID
        //System.out.println(object1); // print constructor ID

        Iphone object2 = new Iphone(); // print -> inside constructor
        new Iphone(); // print -> inside constructor
        System.out.println();

        Iphone iphone14ProMax = new Iphone();
        Iphone iphone13ProMax = iphone14ProMax;
        Iphone iphone14Pro = new Iphone();

        Iphone iphoneSE = new Iphone(256);
        Iphone iphoneX = new Iphone(128);
        System.out.println(iphoneX); // it will print just constructors.Iphone@8efb846
        Iphone iphone12Pro = new Iphone();

        System.out.println(new Iphone(512)); //this iphone has: 512Gb memory.
                                                     //constructors.Iphone@5caf905d

        System.out.println(new Iphone(512)); //this iphone has: 512Gb memory.
                                                    //constructors.Iphone@@27716f4

        Iphone mobile = new Iphone();
        System.out.println(mobile.price); // 999.99
        mobile.isUnlocked = true;
        System.out.println(mobile.isUnlocked); // true
        System.out.println(new Iphone(24324));

        mobile.playMusic();
        iphoneSE.playMusic();
        iphone14ProMax.playMusic();
        new Iphone().playMusic();

    }

    public void playMusic(){
        System.out.println("Iphone is playing music");
    }
}
