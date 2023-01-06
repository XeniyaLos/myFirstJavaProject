package baiaChallenges;

import java.util.*;

public class Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Print decimal number: ");
        double input = scan.nextDouble();
        String output = "";

        if(input < 0 || input > 100.00){
            output = "Out of interval";
        }else if(input >= 0 && input <= 25.00){
            output = "Intervalo (0, 25]";
        }else if(input > 25.00 && input <= 50.00){
            output = "Intervalo (25, 50]";
        }else if(input > 50.00 && input <= 75.00) {
            output = "Intervalo (50, 75]";
        }else if(input > 75.00 && input <= 100.00) {
            output = "Intervalo (75, 100]";
        }
        System.out.println(output);
    }
}
