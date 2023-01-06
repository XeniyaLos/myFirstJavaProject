package ifElseLogicalOperators;

public class IfElsePractice {
    public static void main(String[] args) {

        int x = 100;
        int y = 20;

        if(x > y){
            System.out.println("x is equals to y");
        }else if(y < x){
            System.out.println("this is my 1st if else code");
        }else if(x > y){
            System.out.println("x is more than y");
        }else{
            System.out.println("This is my else statement");
        }
        System.out.println(x + y);

        // ============== //

        String weather = "sunny";
        double temp = 90.5;

        if(weather.equals("sunny")){
            System.out.println("Lets go to the beach!");
        }
        if(temp > 104){
            System.out.println("Stay home! Too hot outside!");
        }
        if(temp > 90){
            System.out.println("Lets go walking");
        }
    }
}
