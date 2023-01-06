package classesAndObjects;

public class Zoo {
    public static void main(String [] args){

        Animal elephant = new Animal();
        Animal lion = new Animal();
        Animal mouse = new Animal();
        Animal chicken = new Animal();

        elephant.type = "elephant";
        elephant.color = "gray";
        elephant.size = "large";
        elephant.name = "Dumbo";

        elephant.eats();
        elephant.sleeps();
        elephant.plays();
        System.out.println();

        lion.type = "cat";
        lion.color = "yellow";
        lion.size = "medium";
        lion.name = "Alex";

        lion.plays();
        lion.eats();
        lion.isMammal();
        System.out.println();

        mouse.type = "mouse";
        mouse.color = "white";
        mouse.size = "small";
        mouse.name = "Jerry";

        mouse.sleeps();
        System.out.println();

        chicken.type = "bird";
        chicken.color = "brown";
        chicken.size = "small";
        chicken.name = "Dory";

        chicken.getName();
        chicken.eats();
        chicken.plays();

    }
}
