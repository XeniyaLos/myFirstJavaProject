package mentoring;

public class Space {
    public static void main(String[] args) {

        int sum = add(5, 8);
        System.out.println(sum);

    }

    /*public static void add(int number1, int number2){
        int sum = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + sum); */

        //Method modification
        //instead of printing sum - return it to user

    public static int add(int number1, int number2){
        int sum = number1 + number2;
        return sum;
    }
}
