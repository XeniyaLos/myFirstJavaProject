package mentoring;

import java.util.Scanner;

public class BenaIfElseRecap {

    public static void caughtSpeeding(int speed, boolean isBirthday) {

        if (speed <= 60) {
            System.out.println("no ticket");
        } else if (speed > 60 && speed <= 80 && !isBirthday) {
            System.out.println("you get small ticket");
        } else if (speed > 60 && speed <= 80 && isBirthday) {
            System.out.println("since its your birthday, no ticket");
        } else if (speed > 80 && !isBirthday) {
            System.out.println("you get big ticket");
        } else if (speed > 80 && isBirthday) {
            System.out.println("since its your birthday, no ticket");
        }
    }

    public static boolean love6(int a, int b){
        if(a == 6 || b == 6 || a + b == 6){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    /*
        int speed = scan.nextInt();
        boolean isBirthday = scan.nextBoolean();

        caughtSpeeding(speed, isBirthday);
    */

        int a = scan.nextInt();
        int b = scan.nextInt();
        boolean result = love6(a, b);
        System.out.println(result);
    }

}

